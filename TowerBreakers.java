public class TowerBreakers {
    public static void main(String[] args) {

    }

    //   int n: the number of towers
    //  int m: the height of each tower
    /*
    Too many useless information in the question description.

All towers always have the same height, so a player can always mirror the move of the other player.

Therefore, if the number of towers are even, then P2 always have the strategy to mirror the moves made by P1, leaving P1 to loose.

If the number of towers are odd, then P1 can reduce a tower to 1, then after P2 makes a move, P1 always mirror the moves made by P2, leaving P2 to lose. (This includes the case where there is only 1 tower).

If the height of tower is 1, then P1 always lose immediately
     */
    public static int towerBreakers(int n, int m) {
        // Write your code here
        if (m == 1) {
            return 2;
        }
        return n % 2 == 0 ? 2 : 1;
    }
}

/*
Two players are playing a game of Tower Breakers! Player  always moves first,
and both players always play optimally.The rules of the game are as follows:

Initially there are  towers.
Each tower is of height .
The players move in alternating turns.
In each turn, a player can choose a tower of height  and reduce its height to ,
where  and  evenly divides .
If the current player is unable to make a move, they lose the game.
Given the values of  and , determine which player will win. If the first player
wins, return . Otherwise, return .

Example.

There are  towers, each  units tall. Player  has a choice of two moves:
- remove  pieces from a tower to leave  as
- remove  pieces to leave

Let Player  remove . Now the towers are  and  units tall.

Player  matches the move. Now the towers are both  units tall.

Now Player  has only one move.

Player  removes  pieces leaving . Towers are  and  units tall.
Player  matches again. Towers are both  unit tall.

Player  has no move and loses. Return .

Function Description

Complete the towerBreakers function in the editor below.

towerBreakers has the following paramter(s):

int n: the number of towers
int m: the height of each tower
Returns

int: the winner of the game
Input Format

The first line contains a single integer , the number of test cases.
Each of the next  lines describes a test case in the form of  space-separated integers,  and .

Constraints


 */