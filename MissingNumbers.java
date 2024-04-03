import java.util.*;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

public class MissingNumbers {
    public static void main(String[] args) {
      /*  List<Integer> arr = new ArrayList<>(List.of(7, 2, 5, 3, 5, 3));
        List<Integer> brr = new ArrayList<>(List.of(7, 2, 5, 4, 6, 3, 5, 3));*/
        List<Integer> arr = new ArrayList<>(List.of(203, 204, 205, 206, 207, 208, 203, 204, 205, 206));
        List<Integer> brr = new ArrayList<>(List.of(203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204));
        System.out.println(missingNumbers(arr, brr));
    }

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here
        //     Collections.sort(arr);
             arr.forEach(i -> brr.remove(i));
       return new ArrayList<>(new TreeSet<>(brr));
      /*  for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < brr.size(); j++) {
                if (Objects.equals(brr.get(j), arr.get(i))) {
                    brr.remove(j);
                    break;
                }
            }
        }
        Collections.sort(brr);
        Set<Integer> result = new HashSet<>(brr);

        return new ArrayList<>(result);*/
    }
}

/*
Given two arrays of integers, find which elements in the second array are missing from the first array.

Example
arr = {7, 2, 5, 3, 5, 3}
brr = {7, 2, 5, 4, 6, 3, 5, 3}

The brr array is the orginal list. The numbers missing are {4, 6}.

Notes

If a number occurs multiple times in the lists, you must ensure that the frequency of that number in both
lists is the same. If that is not the case, then it is also a missing number.
Return the missing numbers sorted ascending.
Only include a missing number once, even if it is missing multiple times.
The difference between the maximum and minimum numbers in the original list is less than or equal to 100.
Function Description

Complete the missingNumbers function in the editor below. It should return a sorted array of missing numbers.

missingNumbers has the following parameter(s):

int arr[n]: the array with missing numbers
int brr[m]: the original array of numbers
Returns

int[]: an array of integers
Input Format

There will be four lines of input:

n - the size of the first list, arr
The next line contains n space-separated integers arr[i]
m - the size of the second list, brr
The next line contains m space-separated integers brr[i]

Sample Input

10
203 204 205 206 207 208 203 204 205 206
13
203 204 204 205 206 207 205 208 203 206 205 206 204

Sample Output

204 205 206


Explanation

204 is present in both arrays. Its frequency in arr is 2, while its frequency
 in brr is 3. Similarly, 205 and 206 occur twice in arr, but three times in brr. The rest
 of the numbers have the same frequencies in both lists.

 */