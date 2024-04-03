import java.util.ArrayList;
import java.util.List;

public class SherlockAndArray {
    public static void main(String[] args) {
   //     List<Integer> arr = new ArrayList<>(List.of(5, 6, 8, 11)); // y
     //   List<Integer> arr = new ArrayList<>(List.of(1, 2, 3));  // n
     //   List<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 3)); // y
    //    List<Integer> arr = new ArrayList<>(List.of(2, 0, 0, 0)); // y
        List<Integer> arr = new ArrayList<>(List.of(1));
        System.out.println(balancedSums(arr));
    }

    public static String balancedSums(List<Integer> arr) {
        // Write your code here
        if (arr.size() == 1) return "YES";
        int rightSum = 0;
        int leftSum = arr.stream().skip(1).reduce(Integer::sum).orElse(0);

        for (int i = 0; i < arr.size() - 1; i++) {
            if (rightSum == leftSum) return "YES";
            rightSum += arr.get(i);
            leftSum -= arr.get(i + 1);
        }
        return "NO";

        /*
             for (int i = 0; i < arr.size(); i++) {
            rightSum = arr.stream().limit(arr.size() - (arr.size() - i)).reduce(Integer::sum).orElse(0); //i == 0 ? 0 :
              System.out.println(rightSum);
            leftSum = arr.stream().skip(i + 1).reduce(Integer::sum).orElse(0);  // i == arr.size() - 1 ? 0 :
                System.out.println(leftSum);
            if (rightSum == leftSum) return "YES";
        }
         */
    }
}

/*
Problem:
Watson gives Sherlock an array of integers. His challenge is to find an element of the array such that the sum of all elements to the left is equal to the sum of all elements to the right.

Example
arr = [5, 6, 8, 11]

8 is between two subarrays that sum to 11.

arr = [1]
The answer is [1] since left and right sum to 0.

You will be given arrays of integers and must determine whether there is an element that meets the criterion. If there is, return YES. Otherwise, return NO.

Function Description

Complete the balancedSums function in the editor below.

balancedSums has the following parameter(s):

int arr[n]: an array of integers
Returns

string: either YES or NO
Input Format

The first line contains T, the number of test cases.

The next T pairs of lines each represent a test case.
- The first line contains n, the number of elements in the array arr.
- The second line contains n space-separated integers arr[i] where 0 <= i <= n.

Constraints
1 <= T <= 10
1 <= n <= 100000
1 <= arr[i] <= 2 x 10000
0 <= i <= n

Sample Input 0

2
3
1 2 3
4
1 2 3 3
Sample Output 0

NO
YES
Explanation 0

For the first test case, no such index exists.
For the second test case, arr[0] + arr[1] = arr[3], therefore index 2 satisfies the given conditions.

Sample Input 1

3
5
1 1 4 1 1
4
2 0 0 0
4
0 0 2 0
Sample Output 1

YES
YES
YES
Explanation 1

In the first test case, arr[2] = 4 is between two subarrays summing to 2.
In the second case, arr[0] = 2 is between two subarrays summing to 0.
In the third case,  arr[2] = 2 is between two subarrays summing to 0.
 */