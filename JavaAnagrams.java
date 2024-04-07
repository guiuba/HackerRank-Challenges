import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaAnagrams {
    public static void main(String[] args) {
        System.out.println(solution("anagramm", "marganaa")); // "Not Anagrams"
    }

    
    public static String solution(String a, String b) {
        Map<String, Integer> frequencyCharMapOfA = new HashMap<>();
        List.of(a.toLowerCase().split(""))
                .forEach(c -> {
                    frequencyCharMapOfA.merge(c, 1, Integer::sum);
                });

        Map<String, Integer> frequencyCharMapOfB = new HashMap<>();
        List.of(b.toLowerCase().split(""))
                .forEach(c -> {
                    frequencyCharMapOfB.merge(c, 1, Integer::sum);
                });

        return frequencyCharMapOfA.equals(frequencyCharMapOfB) ? "Anagrams" : "Not Anagrams";
    }
}

/*
Problem:
Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If a and b are case-insensitive anagrams, return true. Otherwise, return false.
Input Format

The first line contains a string .
The second line contains a string .

Sample Input 0

anagram
margana
Sample Output 0

Anagrams

Sample Input 1

anagramm
marganaa
Sample Output 1

Not Anagrams
 */