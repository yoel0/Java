/* ReverseString, Java, String, Algorithm
* Reverse a string.
*
* 1. Create a ReverseString class.
* 2. Initiate main to run fn.
* 3. Write out fn that takes a str, as a parameter.
* ! EDGE CASE: Return empty str if value is zilch.
* 4. Apply the logic to reverse the string thats right, invoke the FOR loop baby.
* 5. Return the reversed string.
* ! Rubber Ducky Message: 
* Don't forget this is Java yo-yo, compile that .... beautiful thing? >:P
*/

public class ReverseString {

  public static void main(String[] args) {
    System.out.println(rainInKyoto("Java llama.."));
  }

  public static String rainInKyoto(String str) {
    if (str == null || str.isEmpty()) {
      return str;
    }

    char[] value = str.toCharArray();

    for (int i = 0, sl = str.length() - 1; i < sl; i++, sl--) {
      char tmp = value[i];
      value[i] = value[sl];
      value[sl] = tmp;
    }

    return new String(value);
  }
}

// Returns
// ..amall avaJ