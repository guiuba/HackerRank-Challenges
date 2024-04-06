import javax.xml.transform.Result;
import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class CastleOnTheGrid {
    /*
     * Complete the 'minimumMoves' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING_ARRAY grid
     *  2. INTEGER startX
     *  3. INTEGER startY
     *  4. INTEGER goalX
     *  5. INTEGER goalY
     */
    public static void main(String[] args) throws IOException {
      List<String> grid = List.of(".X.", ".X.", "...");
        System.out.println(minimumMoves(grid, 0, 0, 0, 2));
    }
    public static int minimumMoves(List<String> grid, int startX, int startY, int goalX, int goalY) {
        // Write your code here
        // We will assume the grid is filled and not empty
        // 1. Create a character matrix representing the SQUARE grid.
        int gridSize = grid.size();
        char[][] charGrid = new char[gridSize][gridSize];
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                charGrid[i][j] = grid.get(i).charAt(j);
            }
        }

// 2. Implement BFS w/ a Queue. Point objects will be used to track valid cells.
        Queue<Point> queue = new LinkedList<>();
        // Create a "steps" matrix representing the steps to get to a cell in the grid.
        int[][] steps = new int[gridSize][gridSize];
        // Keep track of cells visited to avoid adding them to the Queue.
        boolean[][] visited = new boolean[gridSize][gridSize];
        // Add the starting point to the queue to start BFS.
        queue.add(new Point(startX, startY));
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            Point current = queue.poll();
            // 3. We can move in 4 directions: Up (0), Right (1), Down (2), and Left (3).
            //    To represent these directions, refer to xMove and yMove.
            //    We will be adding to our queue the cells of each valid step in each
            //    direction of our current cell.
            for (int i = 0; i < 4; i++) {
                // Used to explore the "adjacent" cells a certain valid distance from
                // the current cell in each valid direction.
                int distance = 1;
                // Check if the cell we are trying to "move" into is a valid cell.
                // A valid cell is a cell that is not an obstacle (X), and within bounds.
                while (isSafe(gridSize, current.x + xMove[i]*distance, current.y +
                        yMove[i]*distance, charGrid) && !visited[current.x + xMove[i]*distance]
                        [current.y + yMove[i]*distance]) {
                    // Record the Point coordinates to be added into the queue.
                    int nextX = current.x + xMove[i]*distance;
                    int nextY = current.y + yMove[i]*distance;
                    visited[nextX][nextY] = true;
                    queue.add(new Point(nextX, nextY));
                    // Keep track of the "steps" taken to get to a cell.
                    steps[nextX][nextY] = steps[current.x][current.y] +1;
                    // Case where the point "adjacent" to current is the goal.
                    if (nextX == goalX && nextY == goalY) {
                   //     System.out.println(steps[nextX][nextY]);
                        return steps[nextX][nextY];
                    }
                    distance++;
                }
            }
        }

        // By default, return -1, indicating that the grid was not valid.
        return -1;
    }
    // Helper arrays used to define directions.
    // To move up (index 0): xMove is -1, yMove is 0.
    // To move right (index 1): xMove is 0, yMove is 1.
    // To move down (index 2): xMove is 1, yMove is 0.
    // To move left (index 3): xMove is 0, yMove is -1.
    private static int[] xMove = {-1, 0, 1, 0};
    private static int[] yMove = { 0, 1, 0, -1};

    // Private helper method to check if a step/move to a cell is valid in the grid.
    private static boolean isSafe (int gridSize, int x, int y, char[][] charGrid) {
        return (x >= 0 &&
                y >= 0 &&
                x < gridSize &&
                y < gridSize &&
                charGrid[x][y] == '.');
    }
}

// Private helper class used to instantiate "Point" objects
// A "Point" is used in the queue used to store valid moves from
// a current "Point"
class Point {
    public int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
//}


/*
You are given a square grid with some cells open (.) and some blocked (X).
Your playing piece can move along any row or column until it reaches the edge of
the grid or a blocked cell. Given a grid, a start and a goal, determine the minmum
number of moves to get to the goal.

Example.






The grid is shown below:

...
.X.
...
The starting position  so start in the top left corner. The goal is . The path is .
It takes  moves to reach the goal.

Function Description
Complete the minimumMoves function in the editor.

minimumMoves has the following parameter(s):

string grid[n]: an array of strings that represent the rows of the grid
int startX: starting X coordinate
int startY: starting Y coordinate
int goalX: ending X coordinate
int goalY: ending Y coordinate
Returns

int: the minimum moves to reach the goal
Input Format

The first line contains an integer , the size of the array grid.
Each of the next  lines contains a string of length .
The last line contains four space-separated integers,

Constraints

Sample Input

STDIN       FUNCTION
-----       --------
3           grid[] size n = 3
.X.         grid = ['.X.','.X.', '...']
.X.
...
0 0 0 2     startX = 0, startY = 0, goalX = 0, goalY = 2
Sample Output

3
Explanation

Here is a path that one could follow in order to reach the destination in  steps:

.
 */
