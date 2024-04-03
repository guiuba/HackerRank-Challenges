import java.util.ArrayList;
import java.util.List;

public class SansaAndXOR {
    public static void main(String[] args) {
              List<Integer> arr = new ArrayList<>(List.of(1, 2, 3)); // 2
      //  List<Integer> arr = new ArrayList<>(List.of(4, 5, 7, 5)); // 0

        System.out.println(sansaXor(arr));
    }

    public static int sansaXor(List<Integer> arr) {
        // Write your code here
        if(arr.size() % 2 == 0) return 0;
        int result = 0;
        for (int i = 0; i < arr.size(); i += 2) {
            result ^= arr.get(i);
        }

        return result;

        //    int allXor = 0;
        //xor with ever element
 /*       for (int i = 1; i < arr.size(); i++) {
            result ^= arr.get(i);
        }
        //    allXor = result;
        //xor with pairs
        for (int i = 0; i < arr.size() - 1; i++) {
            result ^= (arr.get(i) ^ arr.get(i + 1));
        }

        //   result ^= subArraysXor;
        int subArraySize = 1;
        while (subArraySize <= arr.size() - 1) {
            int resultAux = 0;
            for (int i = 0; i < arr.size(); i++) {

                resultAux ^= arr.get(i);
            }
            result ^= resultAux;
            subArraySize++;
        }
        for (int i = 0; i < arr.size() - 1; i++) {
            result ^= (arr.get(i) ^ arr.get(i + 1));
        }

        return result;*/
    }
}

/*
Problem:
Sansa has an array. She wants to know the value that can be obtained using the XOR operator on contiguous subarrays, followed by applying the same operator [XOR on the result obtained. Can you help her with this task?

Note: [1, 2, 3] is a contiguous subarray of [1, 2, 3, 4] while [1, 2, 4] is not.

Input format
The first line contains an integer T, which represents the number of test cases. The first line of each test case contains an integer N, the number of elements in the array. The second line of each test case contains N integers that represent the elements of the array.

Output format
Print the response corresponding to each test case on a different line

Restrictions:
1 <= T <= 5
2 <= N <= 100000
1 <= array size <= 10.000.000

Input Exemple:

1
3
1 2 3
Output Exemple:

2

Explanation:
1 ^ 2 ^ 3 ^ (1 ^ 2) ^ (2 ^ 3) ^ (1 ^ 2 ^ 3) = 2
 */
