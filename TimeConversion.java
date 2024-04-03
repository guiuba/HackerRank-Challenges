public class TimeConversion {
    public static void main(String[] args) {
  //   String s = "12:01:00PM";
    //    String s = "07:05:45PM";
    //    String s = "12:01:00AM";
    //    String s = "12:00:00AM";
        String s = "12:00:00PM";
    //    String s = "01:01:00AM";
        System.out.println(solution(s));
    }
    static String solution(String s) {
        boolean isPm = "PM".equals(s.substring(s.length() - 2));
        if (!isPm) {
            if ("12".equals(s.substring(0, 2))) {
                return String.format("00%s", s.substring(2, s.length() - 2));
            }
            return s.substring(0, s.length() -2);
        } else {
            if ("12".equals(s.substring(0, 2))) {
                return s.substring(0, s.length() - 2);
            }
            return String.format("%s%s",(12 + Integer.parseInt(s.substring(0, 2))), s.substring(2, s.length() - 2));
        }
    //    return s;
    }
}

/*
Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Example


Return '12:01:00'.


Return '00:01:00'.

Function Description

Complete the timeConversion function in the editor below. It should return a
new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

string s: a time in  hour format
Returns

string: the time in  hour format
Input Format

A single string  that represents a time in -hour clock format (i.e.:  or ).

Constraints

All input times are valid
Sample Input

07:05:45PM
Sample Output

19:05:45
 */
