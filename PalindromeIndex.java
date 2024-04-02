package mockTests;

public class PalindromeIndex {
    public static void main(String[] args) {
            String s = "bcbc";
     //   String s = "cbc";
        //     String s = "baa";
        //     String s = "aaab";
        System.out.println(palindromeIndex(s));


    }

    public static int palindromeIndex(String s) {
        char[] c = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (c[i] != c[j]) return Math.max(PalindromeAux(c, i), PalindromeAux(c, j));
            i++;
            j--;
        }
        return -1;
    }

    public static int PalindromeAux(char[] c, int index) {
        int i = 0, j = c.length - 1;
        while (i < j) {
            if (i == index) {
                i++;
                continue;
            } else if (index == j) {
                j--;
                continue;
            }
            if (c[i++] != c[j--]) return -1; // another pair of different chars = no solution
        }
        return index;
    }

}

/* My solution, scored 47% not optmized
   int result = -1;
        if (new StringBuilder(s).reverse().toString().equals(s)) return result;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.delete(i, i + 1);
            if(sb.toString().equals(sb.reverse().toString())) {
                result = i;
                break;
            }

        }

        return result;


Given a string of lowercase letters in the range ascii[a-z], determine the index of a
character that can be removed to make the string a palindrome. There may be more than
one solution, but any will do. If the word is already a palindrome or there is no solution,
return -1. Otherwise, return the index of a character to remove.

Example

Either remove 'b' at index  or 'c' at index .

Function Description

Complete the palindromeIndex function in the editor below.

palindromeIndex has the following parameter(s):

string s: a string to analyze
Returns

int: the index of the character to remove or
Input Format

The first line contains an integer , the number of queries.
Each of the next  lines contains a query string .

Constraints

All characters are in the range ascii[a-z].
Sample Input

STDIN   Function
-----   --------
3       q = 3
aaab    s = 'aaab' (first query)
baa     s = 'baa'  (second query)
aaa     s = 'aaa'  (third query)
Sample Output

3
0
-1
Explanation

Query 1: "aaab"
Removing 'b' at index  results in a palindrome, so return .

Query 2: "baa"
Removing 'b' at index  results in a palindrome, so return .

Query 3: "aaa"
This string is already a palindrome, so return . Removing any one of the
characters would result in a palindrome, but this test comes first.

Note: The custom checker logic for this challenge is available here.
 */