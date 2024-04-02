package mockTests;

import java.util.*;
import java.util.stream.Stream;

public class Anagram {
    public static void main(String[] args) {
     //       String s = "abccde"; // 2
     //       String s = "aaabbb"; // 3
        //  String s = "ab"; // 1
        //    String s = "abc"; // -1
      //  String s = "mnop"; // 2
       //     String s = "xyyx"; // 0
             String s = "xaxbbbxx";
        System.out.println(anagram(s));

    }

    public static int anagram(String s) {
        // Write your code here
        if (s.length() % 2 != 0) return -1;
        int middle = s.length() / 2;
        String sub1 = s.substring(0, middle);
        String sub2 = s.substring(middle);
        for (char c : sub1.toCharArray()) {

            if (sub2.contains(Character.toString(c))) {
                sub2 = sub2.replaceFirst(Character.toString(c), "");
            }
        }
        return sub2.length();

    }
}

/*
Two words are anagrams of one another if their letters can be rearranged to form the other word.

Given a string, split it into two contiguous substrings of equal length. Determine the minimum
number of characters to change to make the two substrings into anagrams of one another.

Example s = abccde

Break  into two parts: 'abc' and 'cde'. Note that all letters have been used, the substrings
are contiguous and their lengths are equal. Now you can change 'a' and 'b' in the first substring
to 'd' and 'e' to have 'dec' and 'cde' which are anagrams. Two changes were necessary.

Function Description

Complete the anagram function in the editor below.

anagram has the following parameter(s):

string s: a string
Returns

int: the minimum number of characters to change or -1.
Input Format

The first line will contain an integer, , the number of test cases.
Each test case will contain a string .

Constraints


 consists only of characters in the range ascii[a-z].

      if (s.length() % 2 != 0) return -1;
        int charactersToChange = 0;
        int middle = s.length() / 2;
        String sub1 = s.substring(0, middle);
        String sub2 = s.substring(middle);
        for (char c : sub1.toCharArray()) {
            if (!sub2.contains(Character.toString(c))) {
                charactersToChange++;
            }
        }
        return charactersToChange;
 */