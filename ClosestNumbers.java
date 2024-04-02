import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClosestNumbers {
    public static void main(String[] args) {
  /*      List<Integer> arr = new ArrayList<>(List.of(
                -20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854
        ));*/
      /*  List<Integer> arr = new ArrayList<>(List.of(
                -20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854, -520, -470
        ));*/
        List<Integer> arr = new ArrayList<>(List.of(
                5, 4, 3, 2
        ));


        System.out.println(closestNumbers(arr));
    }

    public static List<Integer> closestNumbers(List<Integer> arr) {
        // Write your code here
        int minDiff = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        Collections.sort(arr);
        for (int i = 1; i < arr.size(); i++) {
            int diff = arr.get(i) - arr.get(i - 1);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        for (int i = 1; i < arr.size(); i++) {
            int diff = arr.get(i) - arr.get(i - 1);
            if (diff == minDiff) {
                list.add(arr.get(i - 1));
                list.add(arr.get(i));
            }
        }
        return list;
    }
}

/*
Sorting is useful as the first step in many different tasks. The most common task
is to make finding things easier, but there are other uses as well. In this case, it
will make it easier to determine which pair or pairs of elements have the smallest
absolute difference between them.

Example arr = {5, 2, 3, 4, 1}

Sorted arr' = {1, 2, 3, 4, 5}. Several pairs have the minimum
difference of 1: [(1, 2), (2, 3), (3, 4), (4, 5)]
. Return the array {1, 2, 2, 3, 3, 4, 4, 5}.

Note
As shown in the example, pairs may overlap.

Given a list of unsorted integers, , find the pair of elements that have the smallest
absolute difference between them. If there are multiple pairs, find them all.

Function Description

Complete the closestNumbers function in the editor below.

closestNumbers has the following parameter(s):

int arr[n]: an array of integers
Returns
- int[]: an array of integers as described

Input Format

The first line contains a single integer , the length of .
The second line contains  space-separated integers, .
Sample Input 0
-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854
Sample Output 0
-20 30
Sample Input 1
-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854 -520 -470
Sample Output 1
-520 -470 -20 30
Sample Input 2
5 4 3 2
Sample Output 2
2 3 3 4 4 5
 */