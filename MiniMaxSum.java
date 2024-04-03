import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1, 3, 5, 7, 9)); //25 total
        solution(arr);
        // System.out.println(solution(arr)); // 16 24
    }

    static void solution(List<Integer> arr) {
        long min = arr.get(0);
        long max = arr.get(0);
        long totalSum = 0;
        for(int i : arr) {
            totalSum += i;
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }

        System.out.println(String.format("%d %d", totalSum - max, totalSum - min));


        //tentativa abaixo incorreta... talvez tenha números repetidos no teste então dá erro
        //     Collections.sort(arr);
        //  long min = arr.stream().limit(4).reduce(Integer::sum).get();
        // long max = arr.stream().skip(1).reduce(Integer::sum).get();
        //  BigInteger min = new BigInteger(String.valueOf(arr.stream().limit(4).reduce(Integer::sum).get()));
        //   BigInteger max = new BigInteger(String.valueOf(arr.stream().skip(1).reduce(Integer::sum).get()));
      //  System.out.println(String.format("%s %s", min, max));
        //   return String.format("%d %d", min, max);
    }
}

/*
Given five positive integers, find the minimum and maximum
values that can be calculated by summing exactly four of the five integers.
Then print the respective minimum and maximum values as a single line of two
space-separated long integers.

Example

The minimum sum is  and the maximum sum is . The function prints
 */
