import java.util.List;

public class DivisibleSumPairs {
    public static void main(String[] args) {
     /*   List<Integer> ar = List.of(1, 2, 3, 4, 5, 6); // 3
        int  n = 6, k = 5;*/

        List<Integer> ar = List.of(1, 3, 2, 6, 1, 2); // 5
        int  n = 6, k = 3;

        System.out.println(divisibleSumPairs(n, k, ar));

    }
    static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int counter = 0;
        for (int i = 0; i < ar.size() - 1; i++) {
            for (int j = i + 1; j < ar.size(); j++) {
                if ((ar.get(i) + ar.get(j)) % k == 0) {
                    counter++;
                }
            }
        }
        return counter;
    }
}

/*
solução colega:
   int counter = 0;
    for (int i = 0; i < ar.size(); i++) {
        final int left = ar.get(i);

        counter += ar.stream().skip(i+1).filter(num ->
            (num+left)%k == 0
        ).count();

    }

    return counter;
Given an array of integers and a positive integer k, determine the number of (i, j) pairs where
i < j and  ar[i] + ar[j] =  is divisible by k.

Example
ar = {1, 2, 3, 4, 5, 6};
k = 5

Three pairs meet the criteria: [1, 4], [2, 3] and [4, 6].

Function Description

Complete the divisibleSumPairs function in the editor below.

divisibleSumPairs has the following parameter(s):

int n: the length of array
int ar[n]: an array of integers
int k: the integer divisor
Returns
- int: the number of pairs

Input Format

The first line contains  space-separated integers,  and .
The second line contains  space-separated integers, each a value of .

Constraints

Sample Input

STDIN           Function
-----           --------
6 3             n = 6, k = 3
1 3 2 6 1 2     ar = [1, 3, 2, 6, 1, 2]
Sample Output

 5
Explanation

Here are the  valid pairs when :


 */