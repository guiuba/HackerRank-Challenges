package mockTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BetweenTwoSeats {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(List.of(2, 6));
        List<Integer> b = new ArrayList<>(List.of(24, 36));

        System.out.println(getTotalX(a, b));
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int result = 0;
        int maxA = Collections.max(a);
        int minB = Collections.min(b);
        IntStream numbers = IntStream.rangeClosed(maxA, minB);

        for (int numInRange : numbers.toArray()) {
            boolean isFactorMultiple = true;
            for (int numInA : a) {
                if (numInRange % numInA != 0) {
                    isFactorMultiple = false;
                    break;
                }
            }
            for (int numInB : b) {
                if (numInB % numInRange!= 0) {
                    isFactorMultiple = false;
                    break;
                }
            }
            if (isFactorMultiple) {
                result++;
            }
        }
        return result;
    }
}


  /*
There will be two arrays of integers. Determine all integers that satisfy the following two conditions:
1. The elements of the first array are all factors of the integer being considered
2. The integer being considered is a factor of all elements of the second array
These numbers are referred to as being between the two arrays. Determine how many such numbers exist.
Example
a ={2, 6}
b = {24, 36}
There are two numbers between the arrays: 6 and 12.
6 % 2 = 0, 6 % 6 = 0, 24 % 6 = 0 and 36 % 6 = 0 for the first value.
12 % 2 = 0, 12 % 6 = 0 and 24 % 12 = 0, 36 % 12 = 0for the second value. Return 2.
Function Description
Complete the getTotalX function in the editor below. It should return the number of integers that are betwen
the sets.
getTotalX has the following parameter(s):
int a[n]: an array of integers
int b[m]: an array of integers
Returns
int: the number of integers that are between the sets
Input Format
The first line contains two space-separated integers, and , the number of elements in arrays and .
The second line contains distinct space-separated integers where .
The third line contains distinct space-separated integers where .
Constraints
Sample Input
2 3
2 4
16 32 96
Sample Output
3
Explanation
2 and 4 divide evenly into 4, 8, 12 and 16.
4, 8 and 16 divide evenly into 16, 32, 96.
4, 8 and 16 are the only three numbers for which each element of a is a factor and each is a factor of all
elements of b.
*/