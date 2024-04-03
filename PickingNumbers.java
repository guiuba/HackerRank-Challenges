import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class PickingNumbers {
    public static void main(String[] args) {
     //   List<Integer> a = new ArrayList<>(List.of(1, 1, 2, 2, 4, 4, 5, 5, 5));
             List<Integer> a = new ArrayList<>(List.of(4, 6, 5, 3, 3, 1)); // 3
        //     List<Integer> a = new ArrayList<>(List.of(98, 3, 99, 1, 97, 2)); //2
        System.out.println(pickingNumbers(a));
    }

    public static int pickingNumbers(List<Integer> a) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int entry : a) {
            map.compute(entry, (k, v) -> v == null ? 1 : v + 1);
        }
        // Write your code here 4, 6, 5, 3, 3, 1
        Collections.sort(a); //1 3 3 4 5 6
        int len = 0;
        int maxLength = 0;
        int min = -2;
        for (int i : a) {
            if (i - min > 1) {
                len = 1;
                min = i;
            } else {
                len++;
                maxLength = Math.max(maxLength, len);
            }

        }
        return maxLength;

    }
}

/*
Given an array of integers, find the longest subarray where the absolute difference between
any two elements is less than or equal to 1.

Example
a = {1, 1, 2, 2, 4, 4, 5, 5, 5}

There are two subarrays meeting the criterion: {1, 1, 2, 2}  and {4, 4, 5, 5, 5}.
The maximum length subarray has 5 elements.

Function Description

Complete the pickingNumbers function in the editor below.

pickingNumbers has the following parameter(s):

int a[n]: an array of integers
Returns

int: the length of the longest subarray that meets the criterion
Input Format

The first line contains a single integer n, the size of the array a.
The second line contains n space-separated integers, each an a[i].

Constraints
2 <=  n <= 100
0 < a[i] < 100
The answer will be >= 2.
 */