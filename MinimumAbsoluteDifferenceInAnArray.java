import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinimumAbsoluteDifferenceInAnArray {
    public static void main(String[] args) {
          List<Integer> arr = new ArrayList<>(List.of(3, -7, 0));
    //    List<Integer> arr = new ArrayList<>(List.of(-2, 2, 4));
        System.out.println(minimumAbsoluteDifference(arr));

    }

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
     //   Collections.reverse(arr);
        List<Integer> res = new ArrayList<>();
        int result = Math.abs(arr.get(0) - arr.get(1));
        for (int i = 0; i < arr.size() - 1; i++) {
            int diff = Math.abs(arr.get(i) - arr.get(i + 1));
            if (diff < result) {
                result = diff;
            }
        }
        return result;
/*
 arr.sort(Integer::compare);
        return IntStream.range(1, arr.size())
            .map(i -> Math.abs(arr.get(i) - arr.get(i-1)))
            .min().orElse(0);
 */
    }
}

/*
The absolute difference is the positive difference between two values a and b,
is written (a - b)  or (b - a)  and they are equal. If a = 3 and b = 2, (3 - 2) = (2 - 3) = 1. Given an array of integers,
find the minimum absolute difference between any two elements in the array.

Example. arr (-2, 2, 4)

There are 3 pairs of numbers: (-2, 2) and (-2, 4) and (2, 4) .
The absolute differences for these pairs are |(-2)-2| = 4, |(-2)-4| = 6
and |2 - 4| = 2. The minimum absolute difference is 2.

Function Description

Complete the minimumAbsoluteDifference function in the editor below. It should return
 an integer that represents the minimum absolute difference between any pair of elements.

minimumAbsoluteDifference has the following parameter(s):

int arr[n]: an array of integers
Returns

int: the minimum absolute difference found
Input Format

The first line contains a single integer , the size of .
The second line contains  space-separated integers, .

Constraints


 */