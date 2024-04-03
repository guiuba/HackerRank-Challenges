import java.util.Scanner;

public class XORStrings3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(String.valueOf(Integer.toBinaryString(Integer.parseInt(scan.next(), 2) ^ Integer.parseInt(scan.next(), 2))));
    /*    int s = Integer.parseInt(scan.next(), 2);
        int t = Integer.parseInt(scan.next(), 2);*/
/*        int s = Integer.parseInt(new java.util.Scanner(System.in).next(), 2);
        int t = Integer.parseInt(new java.util.Scanner(System.in).next(), 2);*/
      //  System.out.println(String.valueOf(Integer.toBinaryString(s ^ t)));
        //10101
        //00101
        //10000 expected

/*
        int first = 15;  // binary format 1111
        int second = 10; // binary format 1010
        int bitwiseXor = first ^ second;
        System.out.println(bitwiseXor);
        System.out.println(Integer.toBinaryString(bitwiseXor));*/

    }
}

/*
In this challenge, the task is to debug the existing code to successfully execute all provided test files.

Given two strings consisting of digits 0 and 1 only, find the XOR of the two strings.

To know more about XOR Click Here

Debug the given function strings_xor to find the XOR of the two given strings appropriately.

Note: You can modify at most three lines in the given code and you cannot add or remove lines to the code.

To restore the original code, click on the icon to the right of the language selector.

Input Format

The input consists of two lines. The first line of the input contains the first string, , and the second
line contains the second string, .

Constraints

Output Format

Print the string obtained by the XOR of the two input strings in a single line.

Sample Input

10101
00101
Sample Output

10000
Explanation

The XOR of the two strings  and  is .
 */