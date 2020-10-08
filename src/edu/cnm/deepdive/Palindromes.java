package edu.cnm.deepdive;

public class Palindromes {

  public static boolean testRecursive(String str) {
    return (str.length() <= 1)
        || (
            str.charAt(0) == str.charAt(str.length() - 1)
                && testRecursive(str.substring(1, str.length() - 1)));
  }

  public static boolean testDenormalized(String str) {
    return testRecursive(str.trim().replaceAll("[\\W]+", "").toLowerCase());
  }

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

}
