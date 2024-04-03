import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SherlockAndTheValidString {
    public static void main(String[] args) {

        //    String s = "abc";
        //    String s = "abcc";
        //     String s = "abccc";
        String s = "aabbcd";
        System.out.println(isValid(s));
    }


    public static String isValid(String s) {
        // Write your code here
        Map<String, Integer> sMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String st = String.valueOf(s.charAt(i));
            sMap.merge(st, 1, Integer::sum);
        }
        //     System.out.println(sMap);
        int removals = 0;
        int sample = sMap.get(String.valueOf(s.charAt(0)));

        for (int value : sMap.values()) {
            if (value != sample) {
                removals++;
            }
            if (value > sample + 1) {
                return "NO";
            }
        }
        return (removals > 1) ? "NO" : "YES";
    }
}

/*
Sherlock considers a string to be valid if all characters of the string appear the same number of times.
It is also valid if he can remove just  character at  index in the string, and the remaining characters
will occur the same number of times. Given a string , determine if it is valid. If so, return YES, otherwise
return NO.

Example
s = abc
This is a valid string because frequencies are a: 1, b: 1, c: 1.

s = abcc
This is a valid string because we can remove one  and have  of each character in the remaining string.

s = abccc
This string is not valid as we can only remove  occurrence of . That leaves character frequencies of .

Function Description

Complete the isValid function in the editor below.

isValid has the following parameter(s):

string s: a string
Returns

string: either YES or NO
Input Format

A single string .

Constraints

Each character
Sample Input

aabbcd
Sample Output

NO
Explanation

 is the minimum number of removals required to make it a valid string. It can be done in following two ways:

Remove c and d to get aabb.
Or remove a and b to get abcd.
 */