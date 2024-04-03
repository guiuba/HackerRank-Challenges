import java.util.List;

public class SubarrayDivision2 {
    public static void main(String[] args) {
      /*  List<Integer> s = List.of(2, 2, 1, 3, 2); //2
        int d = 4, m = 2;*/
       /* List<Integer> s = List.of(4); //1
        int d = 4, m = 1;*/
        List<Integer> s = List.of(2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1); //3
        int d = 18, m = 7;

     /*   List<Integer> s = List.of(1, 2, 1, 3, 2); //3
        int d = 3, m = 2;*/

        System.out.println(birthday(s, d, m));

    }

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int counter = 0;
        if (m == 1 && s.get(0) == d) {
            return 1;
        }
        for (int i = 0; i <= s.size() - m; i++) {
            int aux = s.subList(i, m + i).stream().reduce(Integer::sum).get();
            if (aux == d) {
                counter++;
            }
        }
        return counter;
    }
}

/*
Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.

Lily decides to share a contiguous segment of the bar selected such that:

The length of the segment matches Ron's birth month, and,
The sum of the integers on the squares is equal to his birth day.
Determine how many ways she can divide the chocolate.

Example



Lily wants to find segments summing to Ron's birth day,  with a length equalling his birth month, .
In this case, there are two segments meeting her criteria:  and .

Function Description

Complete the birthday function in the editor below.

birthday has the following parameter(s):

int s[n]: the numbers on each of the squares of chocolate
int d: Ron's birth day
int m: Ron's birth month
Returns

int: the number of ways the bar can be divided
Input Format

The first line contains an integer , the number of squares in the chocolate bar.
The second line contains  space-separated integers , the numbers on the chocolate squares where .
The third line contains two space-separated integers,  and , Ron's birth day and his birth month.
 */