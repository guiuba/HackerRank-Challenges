import java.util.*;

public class CamelCase4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       // scan.useDelimiter("\n");
        while (scan.hasNextLine()) {
          //  String aux = scan.nextLine().trim();
         //   checkInput(aux.split(";"));
            checkInput(scan.nextLine().split(";"));
        }
        scan.close();

    }

    static void checkInput(String[] input) {
        switch (input[0]) {
            case "S" -> split(input);
            case "C" -> combine(input);
         //   default -> System.out.println("Bad input, try again");
        }
    }

    static void combine(String[] input) {
        String aux = camelCaseIt(input[2]);
        switch (input[1]) {
            case "M" -> System.out.printf("%s%s()\n", aux.substring(0, 1).toLowerCase(), aux.substring(1));
            case "C" -> System.out.println(camelCaseIt(aux));
            case "V" -> System.out.printf("%s%s\n", aux.substring(0, 1).toLowerCase(), aux.substring(1));
        }
    }

    static void split(String[] input) {
        switch (input[1]) {
            case "M" -> System.out.println(splitIt(input[2].substring(0, input[2].length() - 2)));
            case "C", "V" -> System.out.println(splitIt(input[2]));
        }
    }
    static String splitIt(String input) {
        String aux = input.substring(0, 1).toLowerCase().concat(input.substring(1));
        char[] inputChars = aux.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputChars.length; i++) {
            char c = inputChars[i];
            if (!Character.isUpperCase(c)) {
                sb.append(c);
            } else {
                sb.append(" ");
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }

    static String camelCaseIt(String input) {
        StringTokenizer st = new StringTokenizer(input, " ");
        StringBuilder camelCaseSB = new StringBuilder();
        while (st.hasMoreTokens()) {
            String aux = st.nextToken();
            camelCaseSB.append(aux.substring(0, 1).toUpperCase().concat(aux.substring(1)));
        }
        return camelCaseSB.toString();
    }
}

/*
Problem:
Camel Case is a naming style common in many programming languages. In Java, method and variable names typically start with a lowercase letter, with all subsequent words starting with a capital letter (example: startThread). Names of classes follow the same pattern, except that they start with a capital letter (example: BlueCar).

Your task is to write a program that creates or splits Camel Case variable, method, and class names.

Input Format

Each line of the input file will begin with an operation (S or C) followed by a semi-colon followed by M, C, or V followed by a semi-colon followed by the words you'll need to operate on.
The operation will either be S (split) or C (combine)
M indicates method, C indicates class, and V indicates variable
In the case of a split operation, the words will be a camel case method, class or variable name that you need to split into a space-delimited list of words starting with a lowercase letter.
In the case of a combine operation, the words will be a space-delimited list of words starting with lowercase letters that you need to combine into the appropriate camel case String. Methods should end with an empty set of parentheses to differentiate them from variable names.
Output Format

For each input line, your program should print either the space-delimited list of words (in the case of a split operation) or the appropriate camel case string (in the case of a combine operation).
Sample Input

S;M;plasticCup()

C;V;mobile phone

C;C;coffee machine

S;C;LargeSoftwareBook

C;M;white sheet of paper

S;V;pictureFrame

Sample Output

plastic cup

mobilePhone

CoffeeMachine

large software book

whiteSheetOfPaper()

picture frame

Explanation

Use Scanner to read in all information as if it were coming from the keyboard.

Print all information to the console using standard output (System.out.print() or System.out.println()).

Outputs must be exact (exact spaces and casing).
 */
