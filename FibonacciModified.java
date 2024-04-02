package mockTests;

import java.math.BigInteger;

public class FibonacciModified {
    public static void main(String[] args) {

        int t1 = 0, t2 = 1, n = 6;
        System.out.println(fibonacciModified(t1, t2, n));

    }
    public static BigInteger fibonacciModified(int t1, int t2, int n) {
        // Write your code here
        BigInteger b1 = BigInteger.valueOf(t1);
        BigInteger b2 = BigInteger.valueOf(t2);
        BigInteger b3;
        if (n == 1) {
            return b1;
        }
        if (n == 2) {
            return b2;
        }
        //ti + 2 = t1 + (t + 1) ^ 2
        for(int i = 3; i <= n; i++){
            b3 = b1.add(b2.multiply(b2));
            b1 = b2;
            b2 = b3;
        }
        return b2;
    }
}

/*
Implement a modified Fibonacci sequence using the following definition:

Given terms t[i] and t[i + 1] where i E (1, infinito), term t[i + 2] is computed as: ti + 2 = t1 + (t + 1) ^ 2

Given three integers, , , and , compute and print the  term of a modified Fibonacci sequence.

Example



Return .

Function Description

Complete the fibonacciModified function in the editor below. It must return the  number in the sequence.

fibonacciModified has the following parameter(s):

int t1: an integer
int t2: an integer
int n: the iteration to report
Returns

int: the  number in the sequence
Note: The value of  may far exceed the range of a -bit integer. Many submission languages have libraries
that can handle such large results but, for those that don't (e.g., C++), you will need to compensate for
the size of the result.

Input Format

A single line of three space-separated integers, the values of , , and .

Constraints

 may far exceed the range of a -bit integer.
Sample Input

0 1 5
Sample Output

5
Explanation

The first two terms of the sequence are  and , which gives us a modified Fibonacci sequence of . The  term
is .
 */