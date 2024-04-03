import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TheBombermanGame {
    public static void main(String[] args) {
        List<String> grid = new ArrayList<>(
                List.of(".......",
                        "...O...",
                        "....O..",
                        ".......",
                        "OO.....",
                        "OO.....")
        );
/*        List<String> grid = new ArrayList<>(
                List.of(".......",
                        "...O...",
                        ".......",
                        ".......",
                        ".......",
                        ".......")
        );*/
     //   System.out.println( bomberMan(2, grid));
        bomberMan(3, grid).forEach(System.out::println);

    }

    public static List<String> bomberMan(int n, List<String> grid) {
        // Write your code here
        if (n == 0 || n == 1) {
            return grid;
        }
        if (n % 2 == 0) {
            return fillGrid(grid);
        }
        List<String> invertedOnce = getInvertedGrid(grid);

        if (n % 4 == 3) {
            return invertedOnce;
        }

        return getInvertedGrid(invertedOnce);

    }

    public static List<String> getInvertedGrid(List<String> grid) {
        List<String> newGrid = new ArrayList<>();

        for (int i = 0; i < grid.size(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < grid.get(i).length(); j++) {
                if (hasNoAdjZero(grid, i, j)) {
                    sb.append('O');
                } else {
                    sb.append('.');
                }
            }
            newGrid.add(sb.toString());
        }
        return newGrid;
    }

    public static boolean hasNoAdjZero(List<String> grid, int row, int col) {

        return !isOAndInBounds(grid, row, col) &&
                !isOAndInBounds(grid, row - 1, col) &&
                !isOAndInBounds(grid, row + 1, col) &&
                !isOAndInBounds(grid, row, col - 1) &&
                !isOAndInBounds(grid, row, col + 1);
    }

    public static boolean isOAndInBounds(List<String> grid, int row, int col) { // checks isValPos and if element is a bomb('O')
        return isInBounds(grid, row, col)
                && grid.get(row).charAt(col) == ('O');
    }

    public static boolean isInBounds(List<String> grid, int row, int col) {  // isValPos checks if row/col is positive and within row/col limits.
        return row >= 0  && col>= 0 && row < grid.size() && col < grid.get(0).length();
    }



    static List<String> fillGrid(List<String> grid) {
        int rows = grid.size();
        int cols = grid.get(0).length();
        List<String> filledGrid = new ArrayList<>();
        char[] bombsArray = new char[cols];
        Arrays.fill(bombsArray, 0, cols, 'O');
        while (rows > 0) {
            filledGrid.add(String.valueOf(bombsArray));
            rows--;
        }
        return filledGrid;
    }

}

/*
   List<char[]> gridInitialState = new ArrayList<>();
        grid.forEach(s -> gridInitialState.add(s.toCharArray()));

      //  List<char[]> bombsInEveryGrid1 = plantBombsEverywhere(grid);
    //    List<char[]> explositonsCharList = plantBombsEverywhere(grid);
        List<char[]> test = new ArrayList<>();
        test.add(new char[7]);
        test.add(new char[7]);
        test.add(new char[7]);
        test.add(new char[7]);
        test.add(new char[7]);
        test.add(new char[7]);
        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.get(0).length(); j++) {
                char c = gridInitialState.get(i)[j];
                if (c == 'O') {
                    //   test.get(i)[j] = '.';
                    //  System.out.println(explositonsCharList.get(i));

                    test.get(i)[j] = '.';
                    if (i >= 1) { // pk
                        //   gridInitialState.get(i - 1)[j] = '.';
                        test.get(i - 1)[j] = '.';
                    }
                    if (i < gridInitialState.size() - 2) {
                        //   gridInitialState.get(i + 1)[j] = '.';
                        test.get(i + 1)[j] = '.';
                    }
                    if (j < gridInitialState.get(0).length - 2) {
                        //    gridInitialState.get(i)[j + 1] = '.';
                        test.get(i)[j + 1] = '.';
                    }
                    if (j > 0) {
                        //   gridInitialState.get(i)[j - 1] = '.';
                        test.get(i)[j - 1] = '.';
                    }
                    test.forEach(System.out::println);
                } else {
                    test.get(i)[j] = 'O';
                }
            }
        }



  /*
        bombsInEveryGrid1.forEach(System.out::println);
        bombsInEveryGrid.forEach(System.out::println);*/
     //   return grid;


/*
Bomberman lives in a rectangular grid. Each cell in the grid either contains a bomb or nothing at all.

Each bomb can be planted in any cell of the grid but once planted, it will detonate after exactly 3 seconds.
Once a bomb detonates, it's destroyed — along with anything in its four neighboring cells. This means that
if a bomb detonates in cell , any valid cells  and  are cleared. If there is a bomb in a neighboring cell,
the neighboring bomb is destroyed without detonating, so there's no chain reaction.

Bomberman is immune to bombs, so he can move freely throughout the grid. Here's what he does:

Initially, Bomberman arbitrarily plants bombs in some of the cells, the initial state.
After one second, Bomberman does nothing.
After one more second, Bomberman plants bombs in all cells without bombs, thus filling the whole grid with bombs.
No bombs detonate at this point.
After one more second, any bombs planted exactly three seconds ago will detonate. Here, Bomberman stands back and
observes.
Bomberman then repeats steps 3 and 4 indefinitely.
Note that during every second Bomberman plants bombs, the bombs are planted simultaneously (i.e., at the exact same
moment), and any bombs planted at the same time will detonate at the same time.

Given the initial configuration of the grid with the locations of Bomberman's first batch of planted bombs,
determine the state of the grid after  seconds.

For example, if the initial grid looks like:

...
.O.
...
it looks the same after the first second. After the second second, Bomberman has placed all his charges:

OOO
OOO
OOO
At the third second, the bomb in the middle blows up, emptying all surrounding cells:

O.O
...
O.O
Function Description

Complete the bomberMan function in the editory below.

bomberMan has the following parameter(s):

int n: the number of seconds to simulate
string grid[r]: an array of strings that represents the grid
Returns

string[r]: n array of strings that represent the grid in its final state
Input Format

The first line contains three space-separated integers , , and , The number of rows, columns and seconds to simulate.
Each of the next  lines contains a row of the matrix as a single string of  characters. The . character denotes
an empty cell, and the O character (ascii 79) denotes a bomb.

Constraints

Subtask

 for  of the maximum score.
Sample Input

STDIN           Function
-----           --------
6 7 3           r = 6, c = 7, n = 3
.......         grid =['.......', '...O...', '....O..',\
...O...                '.......', 'OO.....', 'OO.....']
....O..
.......
OO.....
OO.....
Sample Output

OOO.OOO
OO...OO
OOO...O
..OO.OO
...OOOO
...OOOO
Explanation

The initial state of the grid is:

.......
...O...
....O..
.......
OO.....
OO.....
Bomberman spends the first second doing nothing, so this is the state after 1 second:

.......
...O...
....O..
.......
OO.....
OO.....
Bomberman plants bombs in all the empty cells during his second second, so this is the state after 2 seconds:

OOOOOOO
OOOOOOO
OOOOOOO
OOOOOOO
OOOOOOO
OOOOOOO
In his third second, Bomberman sits back and watches all the bombs he planted 3 seconds ago detonate. This is the
final state after  seconds:

OOO.OOO
OO...OO
OOO...O
..OO.OO
...OOOO
...OOOO
 */
