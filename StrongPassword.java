import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {
    public static void main(String[] args) {
      //  String password = "2bbbb"; // 2
        String password = "2bb#A"; // 1
        System.out.println(minimumNumber(5, password));

    }

    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        boolean hasSpecial = false;
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        int requiredCharacters = 4;
        String special_characters = "!@#$%^&*()-+";
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if(Character.isDigit(c)) {
                hasDigit = true;
                continue;
            }
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
                continue;
            }
            if (Character.isLowerCase(c)) {
                hasLowercase = true;
                continue;
            }
            if (special_characters.contains(String.valueOf(c))) {
                hasSpecial = true;
            }
        }
        if (hasSpecial) {
            requiredCharacters--;
        }
        if (hasUppercase) {
            requiredCharacters--;
        }
        if (hasLowercase) {
            requiredCharacters--;
        }
        if (hasDigit) {
            requiredCharacters--;
        }
        return n >= 6 || n + requiredCharacters >= 6 ? requiredCharacters : 6 - n;
    }
}

/* solução colega:
    String[] pattern = new String[] { ".*[!@#$%^&*()\\-+].*",
        ".*[a-z].*", ".*[A-Z].*", ".*[0-9].*"};
    int missing = (int) Arrays.stream(pattern)
        .filter(p -> !password.matches(p)).count();
    return Math.max(6 - n, missing);
Louise joined a social networking site to stay in touch with her friends.
The signup page required her to input a name and a password. However, the
password must be strong. The website considers a password to be strong if
it satisfies the following criteria:

Its length is at least 6.
It contains at least one digit.
It contains at least one lowercase English character.
It contains at least one uppercase English character.
It contains at least one special character. The special characters are: !@#$%^&*()-+
She typed a random string of length  in the password field but wasn't sure if it was strong.
Given the string she typed, can you find the minimum number of characters she must add to
make her password strong?

Note: Here's the set of types of characters in a form you can paste in your solution:

numbers = "0123456789"
lower_case = "abcdefghijklmnopqrstuvwxyz"
upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
special_characters = "!@#$%^&*()-+"
Example


This password is 5 characters long and is missing an uppercase and a special character.
The minimum number of characters to add is .


This password is 5 characters long and has at least one of each character type. The minimum
number of characters to add is .

Function Description

Complete the minimumNumber function in the editor below.

minimumNumber has the following parameters:

int n: the length of the password
string password: the password to test
Returns

int: the minimum number of characters to add
Input Format

The first line contains an integer , the length of the password.

The second line contains the password string. Each character is either a lowercase/uppercase
English alphabet, a digit, or a special character.
 */
