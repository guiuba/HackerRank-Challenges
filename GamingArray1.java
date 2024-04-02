import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class GamingArray1 {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>(List.of(2, 3, 5, 4, 1));
        //    List<Integer> arr = new ArrayList<>(List.of( 3));
        System.out.println(gamingArray(arr));
    }

    public static String gamingArray(List<Integer> arr) {
        // Write your code here
        int max = -1;
        int counter = 0;
        for (int i : arr) {
            if (i > max) {
                max = i;
                counter++;
            }
        }
        return counter % 2 == 0 ? "ANDY" : "BOB";
    }

}

/*   boolean isBob = false;
      //  List<Integer> newArr = arr;
   //     List<Integer> newArr = arr.stream().limit(arr.indexOf(Collections.max(arr))).toList();

    //    arr = arr.stream().limit(arr.indexOf(Collections.max(arr))).collect(Collectors.toList());
        while (arr.size() > 0) {
        //    isBob = true;
            arr = resizeArray(arr);
            isBob = !isBob;
        }
        return isBob ? "BOB" : "ANDY";
   static List<Integer> resizeArray(List<Integer> arr) {
        return arr.subList(0, arr.indexOf(Collections.max(arr)));
    }
}
  boolean isBob = false;
        List<Integer> newArr = arr;
    //    arr = arr.stream().limit(arr.indexOf(Collections.max(arr))).collect(Collectors.toList());
        while (newArr.size() > 0) {
            isBob = !isBob;
            newArr = newArr.stream().limit(newArr.indexOf(Collections.max(newArr))).collect(Collectors.toList());
        }
        return isBob ? "BOB" : "ANDY";
Andy wants to play a game with his little brother, Bob. The game starts with an array of distinct
integers and the rules are as follows:

Bob always plays first.
In a single move, a player chooses the maximum element in the array. He removes it and all elements
to its right. For example, if the starting array , then it becomes  after removing .
The two players alternate turns.
The last player who can make a move wins.
Andy and Bob play  games. Given the initial array for each game, find and print the name of the winner
on a new line. If Andy wins, print ANDY; if Bob wins, print BOB.

To continue the example above, in the next move Andy will remove . Bob will then remove  and win because
there are no more integers to remove.

Function Description

Complete the gamingArray function in the editor below.

gamingArray has the following parameter(s):

int arr[n]: an array of integers
Returns
- string: either ANDY or BOB

Input Format

The first line contains a single integer , the number of games.

Each of the next  pairs of lines is as follows:

The first line contains a single integer, , the number of elements in .
The second line contains  distinct space-separated integers  where .
Constraints

Array  contains  distinct integers.
For  of the maximum score:

The sum of  over all games does not exceed .
For  of the maximum score:

The sum of  over all games does not exceed .
 */