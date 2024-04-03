import java.util.*;
import java.util.stream.Stream;

public class SalesbyMatch {
    public static void main(String[] args) {
        int n = 7;
        List ar = new ArrayList(List.of(1, 2, 1, 2, 1, 3, 2)); //2

        System.out.println(sockMerchant(n, ar));
    }
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int pairs = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>(ar);
        set.forEach(num -> {
            int counter = 0;
            for (int number : ar) {
                if (number == num) {
                    counter++;
                }
            }
            map.put(num, counter);
        });
      for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
          pairs += entry.getValue() / 2;
      }
        return pairs;
    }
}


/*
There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

Example


There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .

Function Description

Complete the sockMerchant function in the editor below.

sockMerchant has the following parameter(s):

int n: the number of socks in the pile
int ar[n]: the colors of each sock
Returns

int: the number of pairs
Input Format

The first line contains an integer , the number of socks represented in .
The second line contains  space-separated integers, , the colors of the socks in the pile.

Constraints

 where
 */

/*
colega:
    HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < ar.size(); i++) {
            if (set.contains(ar.get(i))) {
                set.remove(ar.get(i));
            }
            else {
                set.add(ar.get(i));
            }
        }

        return ((n - set.size()) / 2);
 */