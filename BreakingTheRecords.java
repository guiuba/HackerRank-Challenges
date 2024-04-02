import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {
    public static void main(String[] args) {
        List<Integer> scores = List.of(12, 24, 10, 24); // 1 1
        breakingRecords(scores).forEach(integer -> System.out.print(integer + " "));
    }

    static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        List<Integer> breakingRecords = new ArrayList<>();
        int minimum = scores.get(0);
        int maximum = scores.get(0);
        int max = 0;
        int min = 0;
        for (int i = 1; i < scores.size(); i++) {
            int score = scores.get(i);
            if (score > maximum) {
                maximum = score;
                max++;
            } else if (score < minimum) {
                minimum = score;
                min++;
            }
        }

        breakingRecords.add(max);
        breakingRecords.add(min);
        return breakingRecords;

    }

}

/*
Maria plays college basketball and wants to go pro. Each season she
maintains a record of her play. She tabulates the number of times she
breaks her season record for most points and least points in a game.
Points scored in the first game establish her record for the season,
and she begins counting from there.

Example

Scores are in the same order as the games played. She tabulates her results as follows:

                                     Count
    Game  Score  Minimum  Maximum   Min Max
     0      12     12       12       0   0
     1      24     12       24       0   1
     2      10     10       24       1   1
     3      24     10       24       1   1
Given the scores for a season, determine the number of times Maria breaks her
records for most and least points scored during the season.

Function Description

Complete the breakingRecords function in the editor below.

breakingRecords has the following parameter(s):

int scores[n]: points scored per game
Returns

int[2]: An array with the numbers of times she broke her records. Index  is
for breaking most points records, and index  is for breaking least points records.
Input Format

The first line contains an integer , the number of games.
The second line contains  space-separated integers describing the respective values of .

Constraints


 */