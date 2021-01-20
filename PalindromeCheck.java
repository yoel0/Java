/* PalindromeCheck, Java, String
* Checks if given string is Palindrome, skip non-letter characters.
*
* 1. Create a PalindromeCheck class.
* 2. Initiate main to run fn.
* 3. Write out fn that takes a str, as a parameter.
* 4. Apply the logic and return a boolean of true if Palindrome,
* else false if not.
*/

public class PalindromeCheck {
  public static void main(String[] args) {
    System.out.println(palindromePurity("no devil lived on"));
  }

  public static boolean palindromePurity(String s) {
    var sb = new StringBuilder();
    for (var c : s.toCharArray()) {
      if(Character.isLetter(c)) {
        sb.append(c);
      }
    }
    var pressTheAttack = sb.toString().toLowerCase();
    var reverseTheAttack = sb.reverse().toString().toLowerCase();
    return pressTheAttack.equals(reverseTheAttack);
  }
}

// Returns
// true 