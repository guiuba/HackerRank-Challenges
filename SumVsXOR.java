public class SumVsXOR {
    public static void main(String[] args) {
        long n = 1000000000000000L;
     //   long max = Long.MAX_VALUE;
        System.out.println(sumXor(5));

    }

    public static long sumXor(long n) {
        // Write your code here
        long power = Long.toBinaryString(n).replace("1", "").length();
        return n == 0 ? 1 : (long) Math.pow(2, power);
    }
}

/*
my no optimal solution:
        long counter = 0;
        long x = 0;
    //    while (x <= n) {
        for (long i = 0; i <= n; i++) {
            if((n + x) == (n ^ x))  {
                counter++;
            }
            x++;
        }
        return counter;
 */

/*
Problem:

Given an integer n, find each x such that:
0 <= x <= n
n + x = n ^ x
where ^ denotes the bitwise XOR operator. Return the number of x's satisfying the criteria.

Example
n = 4

There are four values that meet the criteria:
4 + 0 = 4 ^ 0 = 4
4 + 1 = 4 ^ 1 = 5
4 + 2 = 4 ^ 2 = 6
4 + 3 = 4 ^ 3 = 7
Return 4.
 */