public class NumberLineJumps {
    public static void main(String[] args) {
        int x1 = 2, v1 = 1, x2 = 1, v2 = 2;
        System.out.println(kangaroo(x1, v1, x2, v2));

    }
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        int counter = 0;
        while (counter <= 10000) {
            if(x1 == x2) {
                return "YES";
            }
            x1 += v1;
            x2 += v2;
            counter++;
        }
        return "NO";
    }
}

/*
You are choreographing a circus show with various animals. For one act, you are given
two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity).

The first kangaroo starts at location  and moves at a rate of  meters per jump.
The second kangaroo starts at location  and moves at a rate of  meters per jump.
You have to figure out a way to get both kangaroos at the same location at the same time as part of the
show. If it is possible, return YES, otherwise return NO.

Example




After one jump, they are both at , (, ), so the answer is YES.

Function Description

Complete the function kangaroo in the editor below.

kangaroo has the following parameter(s):

int x1, int v1: starting position and jump distance for kangaroo 1
int x2, int v2: starting position and jump distance for kangaroo 2
Returns

string: either YES or NO
Input Format

A single line of four space-separated integers denoting the respective values of , , , and .
 */
