import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> arr = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(9, 8, 9));
        System.out.println(diagonalDifference(arr));

    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int diagonalLR = 0;
        int diagonalRL = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (i == j) {
                    diagonalLR += arr.get(i).get(j);
                }
                if (i == arr.size() - j - 1) {
                    diagonalRL += arr.get(i).get(j);
                }
            }
        }
        return Math.abs(diagonalLR - diagonalRL);
    }
}

/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:

1 2 3
4 5 6
9 8 9
The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .

Function description

Complete the  function in the editor below.

diagonalDifference takes the following parameter:

int arr[n][m]: an array of integers
Return

int: the absolute diagonal difference
Input Format

The first line contains a single integer, , the number of rows and columns in the square matrix .
Each of the next  lines describes a row, , and consists of  space-separated integers .

Constraints

Output Format

Return the absolute difference between the sums of the matrix's two diagonals as a single integer.

Sample Input

3
11 2 4
4 5 6
10 8 -12
Sample Output

15
Explanation

The primary diagonal is:

11
   5
     -12
Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:

     4
   5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19
Difference: |4 - 19| = 15

Note: |x| is the absolute value of x
 */