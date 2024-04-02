import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        int d = 2;
        System.out.println(rotateLeft(d, arr));
    }
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        while (d > 0) {
            int aux = arr.remove(0);
            arr.add(aux);
            d--;
        }
        return arr;
    }
}

/*
A left rotation operation on an array of size n shifts each of the array's
elements  unit to the left. Given an integer, , rotate the array that many
steps left and return the result.

Example
d = 2
arr = {1, 2, 3, 4, 5}

After 2 rotations, arr = {3, 4, 5, 1, 2}.

Function Description

Complete the rotateLeft function in the editor below.

rotateLeft has the following parameters:

int d: the amount to rotate by
int arr[n]: the array to rotate
Returns

int[n]: the rotated array
Input Format

The first line contains two space-separated integers that denote ,
the number of integers, and , the number of left rotations to perform.
The second line contains  space-separated integers that describe .

Constraints

Sample Input

5 4
1 2 3 4 5
Sample Output

5 1 2 3 4
 */