import java.util.List;

public class _2DArrayDS {
    public static void main(String[] args) {
        List<List<Integer>> arr = List.of(
                List.of(-9, -9, -9, 1, 1, 1),
                List.of(0, -9, 0, 4, 3, 2),
                List.of(-9, -9, -9, 1, 2, 3),
                List.of(0, 0, 8, 6, 6, 0),
                List.of(0, 0, 0, -2, 0, 0),
                List.of(0, 0, 1, 2, 4, 0)
        );

        System.out.println(hourglassSum(arr));
    }

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int maxHourGlassSum = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int glassSum = calculateGlassSum(arr, i, j);
                if (glassSum > maxHourGlassSum) {
                    maxHourGlassSum = glassSum;
                }
            }
        }
        return maxHourGlassSum;
    }

    public static int calculateGlassSum(List<List<Integer>> arr, int i, int j) {
        return arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) +
                arr.get(i + 1).get(j + 1) +
                arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

    }


}

/*
Problem:
Given a 6 X 6 2D Array, arr:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
An hourglass in A is a subset of values with indices falling in this pattern in arr's
graphical representation:

a b c
  d
e f g
There are 16 hourglasses in arr.
An hourglass sum is the sum of an hourglass' values.
Calculate the hourglass sum for every hourglass in arr, then print the maximum hourglass sum.
The array will always be 6 x 6.

Example arr =


-9 -9 -9  1 1 1
 0 -9  0  4 3 2
-9 -9 -9  1 2 3
 0  0  8  6 6 0
 0  0  0 -2 0 0
 0  0  1  2 4 0
The 16 hourglass sums are:

-63, -34, -9, 12,
-10,   0, 28, 23,
-27, -11, -2, 10,
  9,  17, 25, 18
The highest hourglass sum is 28 from the hourglass beginning at row 1, column 2:

0 4 3
  1
8 6 6
 */