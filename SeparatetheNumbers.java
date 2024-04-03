public class SeparatetheNumbers {
    public static void main(String[] args) {
        //   String s = "1234";
        //     String s = "312";
        //     String s = "91011";
      //      String s = "102030";
           String s = "111213";
    //    String s = "010203";
   //     String s = "99100";
        separateNumbers(s);

    }

    public static void separateNumbers(String s) {
        // Write your code here
        for(int i = 1; i < (s.length() + 2) / 2; i++){
            StringBuilder sb = new StringBuilder(s.substring(0, i));
            long number = Long.parseLong(sb.toString());
            long firstNumber = number;
            while(sb.length() < s.length()){
                sb.append("" + ++number);
            }
            if(s.equals(sb.toString())){
                System.out.println("YES " + firstNumber);
                return;
            }
        }
        System.out.println("NO");

    }
}

/*
Problem:
A numeric string, , is beautiful if it can be split into a sequence of two or more
positive integers, , satisfying the following conditions:

 for any  (i.e., each element in the sequence is  more than the previous element).
No  contains a leading zero. For example, we can split  into the sequence , but it is
not beautiful because  and  have leading zeroes.
The contents of the sequence cannot be rearranged. For example, we can split  into the
sequence , but it is not beautiful because it breaks our first constraint (i.e., ).
The diagram below depicts some beautiful strings:

image

Perform  queries where each query consists of some integer string . For each query, print
 whether or not the string is beautiful on a new line. If it is beautiful, print YES x, where
  is the first number of the increasing sequence. If there are multiple such values of , choose
  the smallest. Otherwise, print NO.

Function Description

Complete the separateNumbers function in the editor below.

separateNumbers has the following parameter:

s: an integer value represented as a string
Prints
- string: Print a string as described above. Return nothing.

Input Format

The first line contains an integer , the number of strings to evaluate.
Each of the next  lines contains an integer string  to query.

Constraints


 */