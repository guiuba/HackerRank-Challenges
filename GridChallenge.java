import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class GridChallenge {
    public static void main(String[] args) throws IOException {
 /*       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<String> grid = IntStream.range(0, n).mapToObj(i -> {
                            try {
                                return bufferedReader.readLine();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        })
                        .collect(toList());

                String result = gridChallenge(grid);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();*/

        //   List<String> grid = new ArrayList<>(List.of("abc", "ade", "efg")); // y
        //    List<String> grid = new ArrayList<>(List.of("abc", "lmp", "qrt"));   // y
        //    List<String> grid = new ArrayList<>(List.of("mpxz", "abcd", "wlmf"));  // n
        //     List<String> grid = new ArrayList<>(List.of("abc", "hjk", "mpq", "rtv")); // y
        List<String> grid = new ArrayList<>(List.of("kc", "iu")); // y
        //  List<String> grid = new ArrayList<>(List.of("uxf", "vof", "hmp")); // n
        System.out.println(gridChallenge(grid));


    }

    public static String gridChallenge(List<String> grid) {
        // Write your code here
        //   Collections.sort(grid);
        for (int i = 0; i < grid.size(); i++) {
            StringBuilder rol = new StringBuilder();
            rol.append(checkOrder(grid.get(i))); //grid.get(i).charAt(i)
            grid.set(i, rol.toString());
        }
        for (int i = 0; i < grid.get(0).length(); i++) {
            StringBuilder col = new StringBuilder();
            for (int j = 0; j < grid.size(); j++) {
                col.append(grid.get(j).charAt(i));
            }
            if (!checkOrder(col.toString()).equals(col.toString())) return "NO";
        }
        return "YES";
    }

    /*  static boolean checkOrder(String originalCol) {
          char[] sortedCol = originalCol.toCharArray();
          Arrays.sort(sortedCol);
          return String.valueOf(sortedCol).equals(originalCol);
      }*/
    static String checkOrder(String originalCol) {
        char[] sortedCol = originalCol.toCharArray();
        Arrays.sort(sortedCol);
        return String.valueOf(sortedCol);
    }
}

/*
Given a square grid of characters in the range ascii[a-z], rearrange elements of each row
alphabetically, ascending. Determine if the columns are also in ascending alphabetical order,
top to bottom. Return YES if they are or NO if they are not.

Example

The grid is illustrated below.

a b c
a d e
e f g
The rows are already in alphabetical order. The columns a a e, b d f and c e g are also in
alphabetical order, so the answer would be YES. Only elements within the same row can be rearranged.
They cannot be moved to a different row.

Function Description

Complete the gridChallenge function in the editor below.

gridChallenge has the following parameter(s):

string grid[n]: an array of strings
Returns

string: either YES or NO
Input Format

The first line contains , the number of testcases.

Each of the next  sets of lines are described as follows:
- The first line contains , the number of rows and columns in the grid.
- The next  lines contains a string of length

Constraints



Each string consists of lowercase letters in the range ascii[a-z]

Output Format

For each test case, on a separate line print YES if it is possible to rearrange the grid
alphabetically ascending in both its rows and columns, or NO otherwise.
 */
