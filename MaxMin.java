import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1, 4, 7, 2));  // 1, 2, 4, 7
        System.out.println(maxMin(2, arr));
    }
    public static int maxMin(int k, List<Integer> arr) {
        // Write your code here

       /*The key to solving this problem is first sorting the array. This is because when the array is sorted, we know
       that the minimum difference between groups of numbers are those which they are directly next to. For example:

        4 2 5 1 3 ->We would have to check each number with every other number in order to find the minimum difference

        1 2 3 4 5 -> When sorted, for any number, the number for which it has a nimumum difference is directly next to it

        The same principal applies for groups of numbers

                */
        int length = arr.size();
        int lowestUnfairness = Integer.MAX_VALUE;

        Collections.sort(arr);

//If ther array is sorted, then the min of each window will be element with index i and the max will be element with index i + k - 1
        int currentUnfairness = 0;

        for(int i = 0; i <= length - k; i++){
            currentUnfairness = arr.get(i + k - 1) - arr.get(i); //Get unfairness of the current window of elements

            if(currentUnfairness < lowestUnfairness){ //Update the minimum unfairness if the current unfairness is less
                lowestUnfairness = currentUnfairness;
            }
        }
        return lowestUnfairness;
    }
}

/*
You will be given a list of integers, arr, and a single integer k.
You must create an array of length k from elements of arr such that
its unfairness is minimized. Call that array arr'. Unfairness of an array is calculated as
max(arr') - min(arr')
Where:
- max denotes the largest integer in arr'
- min denotes the smallest integer in arr'

Example
arr = {1, 4, 7, 2}
k = 2

Pick any two elements, say arr' = {4, 7}.
unfairness = max(4, 7) - min (4, 7) = 7 - 4 = 3
Testing for all pairs, the solution {1, 2} provides the minimum unfairness.

Note: Integers in  may not be unique.

Function Description

Complete the maxMin function in the editor below.
maxMin has the following parameter(s):

int k: the number of elements to select
int arr[n]:: an array of integers
Returns

int: the minimum possible unfairness
Input Format

The first line contains an integer , the number of elements in array .
The second line contains an integer .
Each of the next  lines contains an integer  where .
 */