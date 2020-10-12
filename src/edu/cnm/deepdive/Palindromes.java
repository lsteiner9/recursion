package edu.cnm.deepdive;

/**
 * Implements computation of palindromes. {@code testRecursive} is a recursive implementation, while
 * {@code testIterative} is an iterative implementation. Both of these require that punctuation,
 * whitespace, and casing also are part of the palindrome. {@code testDenormalized} allows for
 * testing that ignores those three elements.
 */
public class Palindromes {

  /**
   * Tests whether the {@link String} parameter passed is a palindrome, with a recursive implementation.
   * Requires punctuation, whitespace, and casing to also match when reversed.
   * @param str The potential palindrome.
   * @return A boolean value that indicates whether the string is a palindrome.
   */
  public static boolean testRecursive(String str) {
    return (str.length() <= 1)
        || (
            str.charAt(0) == str.charAt(str.length() - 1)
                && testRecursive(str.substring(1, str.length() - 1)));
  }

  /**
   * Tests whether the {@link String} parameter passed is a palindrome, with an iterative
   * implementation. Requires punctuation, whitespace, and casing to also match when reversed.
   * @param str The potential palindrome.
   * @return A boolean value that indicates whether the string is a palindrome.
   */
  public static boolean testIterative(String str) {
    boolean result = true;
    if (str.length() > 1) {
      for (int i = 0; i < (str.length() / 2); i++) {
        if (str.charAt(i) != str.charAt(str.length() - (i + 1))) {
          result = false;
        }
      }
    }
    return result;
  }

  /**
   * Tests whether the {@link String} parameter passed is a palindrome by calling testRecursive.
   * Does not requires punctuation, whitespace, and casing to match when reversed.
   * @param str The potential palindrome.
   * @return A boolean value that indicates whether the string is palindrome.
   */
  public static boolean testDenormalized(String str) {
    return testRecursive(str.replaceAll("[\\W_]+", "").toLowerCase());
  }

}
