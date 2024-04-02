public class CounterGame {
    public static void main(String[] args) {
        //  System.out.println(Math.log(8.0));
        //    System.out.println((128 & (128 - 1)) == 0);
      //  System.out.println(counterGame(132));
      //  System.out.println((int)(Math.log(132)/Math.log(2)));
      //  System.out.println((int)Math.log(128)/Math.log(2));
     //   System.out.println((int)Math.log(50)/Math.log(2));
    //    System.out.println(Math.log(40)/Math.log(2));
      //  System.out.println((int)Math.floor(Math.log(1000) / Math.log(10)));
     //   System.out.println((int)(Math.log(132)/Math.log(2)));
        System.out.println((int)(Math.log(128)/Math.log(2)));
        System.out.println(Math.pow(2, 7));

    }

    public static String counterGame(long n) {
        // Write your code here
        int counter = 0;
        while (n > 1) {
            int power = (int)(Math.log(n)/Math.log(2));
            double newNum = Math.pow(2,power);
            if( newNum == n){
                n = n/2;
            }else{
                n = n - (long)newNum;
            }
            counter++;
        }
        return counter % 2 != 0 ? "Louise": "Richard";
    }


}
/*

      int counter = 0;
        while (n > 1) {
            int power = (int)(Math.log(n)/Math.log(2));
            double newNum = Math.pow(2,power);
            if( newNum == n){
                n = n/2;
            }else{
                n = n - (long)newNum;
            }
            counter++;
        }
        return counter % 2 != 0 ? "Louise": "Richard";

   public static String counterGame(long n) {
        // Write your code here
        if (n == 1) return "Richard";
        long temp = n;
        int counter = 0;
        while (temp > 1) {
            if (isPowerOf2(temp)) {
                   temp /= 2;
            } else {
                while (!isPowerOf2(temp)) {
                    temp--;
                }
                temp = n - temp; //132 - 128 == 4
                n = temp;
            }
            counter++;
        }
        return counter % 2 != 0 ? "Louise": "Richard";
    }

static boolean isPowerOf2(long n) {
        return (n & (n - 1)) == 0;
    }

Louise and Richard have developed a numbers game. They pick a number and check to see if
it is a power of 2. If it is, they divide it by 2. If not, they reduce it by the next lower
number which is a power of 2. Whoever reduces the number to 1 wins the game. Louise always starts.

Given an initial value, determine who wins the game.

Example

It's Louise's turn first. She determines that  is not a power of . The next lower power of  is ,
so she subtracts that from  and passes  to Richard.  is a power of , so Richard divides it by
and passes  to Louise. Likewise,  is a power so she divides it by  and reaches . She wins the game.

Update If they initially set counter to , Richard wins. Louise cannot make a move so she loses.

Function Description

Complete the counterGame function in the editor below.

counterGame has the following parameter(s):

int n: the initial game counter value
Returns

string: either Richard or Louise
Input Format

The first line contains an integer , the number of testcases.
Each of the next  lines contains an integer , the initial value for each game.

Constraints

Sample Input

1
6
Sample Output

Richard
Explanation

As  is not a power of , Louise reduces the largest power of  less than  i.e., , and hence the counter reduces to .
As  is a power of , Richard reduces the counter by half of  i.e., . Hence the counter reduces to .
As we reach the terminating condition with , Richard wins the game.
 */