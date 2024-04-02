public class CaesarCipher {
    public static void main(String[] args) {
      //  String s = "abc";
   //     String s = "middle-Outz";
        String s = "z";
    //    System.out.println(Character.valueOf((char) 90));
        System.out.println(caesarCipher(s, 1));

    }

    public static String caesarCipher(String s, int k) {
        // Write your code here
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    sb.append(Character.toString((c + k - 65) % 26 + 65)); //(char)% 26
                } else {
                    sb.append(Character.toString((c + k - 97) % 26 + 97));
                }

            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}

/*
Julius Caesar protected his confidential information by encrypting it using a cipher.
Caesar's cipher shifts each letter by a number of letters. If the shift takes you past
the end of the alphabet, just rotate back to the front of the alphabet. In the case of
a rotation by 3, w, x, y and z would map to z, a, b and c.

Original alphabet:      abcdefghijklmnopqrstuvwxyz
Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc
Example


The alphabet is rotated by , matching the mapping above. The encrypted string is .

Note: The cipher only encrypts letters; symbols, such as -, remain unencrypted.

Function Description

Complete the caesarCipher function in the editor below.

caesarCipher has the following parameter(s):

string s: cleartext
int k: the alphabet rotation factor
Returns

string: the encrypted string
Input Format

The first line contains the integer, , the length of the unencrypted string.
The second line contains the unencrypted string, .
The third line contains , the number of letters to rotate the alphabet by.

Constraints



 is a valid ASCII string without any spaces.
 */
