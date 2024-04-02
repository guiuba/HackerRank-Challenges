import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FormingAMagicSquare {
    public static void main(String[] args) {
        List<List<Integer>> s = List.of(
                List.of(5, 3, 4),
                List.of(1, 5, 8),
                List.of(6, 4, 2)
        );

        System.out.println(formingMagicSquare(s));


    }

    public static int formingMagicSquare(List<List<Integer>> s) {
        // Write your code here
        int cost = Integer.MAX_VALUE;
        int[][][] allMagic =
                {
                        {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
                        {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                        {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
                        {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
                        {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                        {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
                        {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                        {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}}
                };
        for (int i = 0; i < 8; i++) {
            int counter = 0;
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    counter += Math.abs(s.get(j).get(k) - allMagic[i][j][k]);
                }
            }
            if (counter < cost) {
                cost = counter;
            }
        }
        return cost;

    }
}

/*
We define a magic square to be an n x n matrix of distinct positive integers from 1  to n² where the
sum of any row, column, or diagonal of length n is always equal to the same number: the magic constant.

You will be given a 3 x 3 matrix  of s integers in the inclusive range [1, 9]. We can convert any digit a
to any other digit b in the range  at cost of . Given , convert it into a magic square at minimal cost.
Print this cost on a new line.

Note: The resulting magic square must contain distinct integers in the inclusive range .

Example

$s = [[5, 3, 4], [1, 5, 8], [6, 4, 2]]

The matrix looks like this:

5 3 4
1 5 8
6 4 2
We can convert it to the following magic square:

8 3 4
1 5 9
6 7 2
This took three replacements at a cost of .

Function Description

Complete the formingMagicSquare function in the editor below.

formingMagicSquare has the following parameter(s):

int s[3][3]: a  array of integers
Returns

int: the minimal total cost of converting the input square to a magic square
Input Format

Each of the  lines contains three space-separated integers of row .

Constraints

Sample Input

4 9 2
3 5 7
8 1 5
Sample Output

1
Explanation

Matrix  initially looks like this:

4 9 2
3 5 7
8 1 5
Observe that it's not yet magic, because not all rows, columns, and center diagonals sum to the same number.

If we change the bottom right value, , from  to  at a cost of ,  becomes a magic square at the minimum
possible cost. Thus, we print the cost, , on a new line.
 */