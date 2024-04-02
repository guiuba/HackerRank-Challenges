import java.util.*;

public class ClimbingTheLeaderboard {
    public static void main(String[] args) {
   /*     List<Integer> ranked = new ArrayList<>(List.of(100, 90, 90, 80));
        List<Integer> player = new ArrayList<>(List.of(70, 80, 105));*/
     /*   List<Integer> ranked = new ArrayList<>(List.of(100, 100, 50, 40, 40, 20, 10));
        List<Integer> player = new ArrayList<>(List.of(5, 25, 50, 120));*/
        List<Integer> ranked = new ArrayList<>(List.of(100, 90, 90, 80, 75, 60));
        List<Integer> player = new ArrayList<>(List.of(50, 65, 77, 90, 102));
        System.out.println(climbingLeaderboard(ranked, player));

    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        List<Integer> res = new ArrayList<>();
        Set<Integer> ranksSet = new HashSet<>(ranked);
        List<Integer> temp = new ArrayList<>(ranksSet);
        temp.sort(Comparator.reverseOrder());
        System.out.println(temp);
        for (int p : player) {
            int index = Collections.binarySearch(temp, p, Comparator.reverseOrder());
            System.out.println(index);
            index = (index < 0) ? Math.abs(index) : index + 1;

            res.add(index);
        }
        return res;

   /* abaixo minha solução(não otimizada)
   List<Integer> rankings = new ArrayList<>();
        Set<Integer> set = new TreeSet<>(ranked).descendingSet();
        //   System.out.println(set);
        for (int score : player) {
            set.add(score);
            rankings.add(new ArrayList<>(set).indexOf(score) + 1);
        }
        return rankings;*/
    }
}

/*
An arcade game player wants to climb to the top of the leaderboard and track their ranking.
The game uses Dense Ranking, so its leaderboard works like this:

The player with the highest score is ranked number  on the leaderboard.
Players who have equal scores receive the same ranking number, and the next player(s) receive
the immediately following ranking number.
Example



The ranked players will have ranks , , , and , respectively. If the player's scores are ,
and , their rankings after each game are ,  and . Return .

Function Description

Complete the climbingLeaderboard function in the editor below.

climbingLeaderboard has the following parameter(s):

int ranked[n]: the leaderboard scores
int player[m]: the player's scores
Returns

int[m]: the player's rank after each new score
Input Format

The first line contains an integer , the number of players on the leaderboard.
The next line contains  space-separated integers , the leaderboard scores in decreasing order.
The next line contains an integer, , the number games the player plays.
The last line contains  space-separated integers , the game scores.

Constraints

 for
 for
The existing leaderboard, , is in descending order.
The player's scores, , are in ascending order.
Subtask

For  of the maximum score:


 */
