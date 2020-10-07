package edu.cnm.deepdive;

public class Palindromes {

  public static boolean testRecursive (String str) {
    return (str.length() <= 1)
        || (
            str.charAt(0) == str.charAt(str.length() - 1)
                && testRecursive(str.substring(1, str.length() - 1)));
  }
}
