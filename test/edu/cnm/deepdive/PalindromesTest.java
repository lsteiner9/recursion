package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromesTest {


  static final String[] inputValues = {
      "radar",
      "sonar",
      "abba",
      "abb",
      "x",
      ""
  };

  static final boolean[] expectedValues = {
      true,
      false,
      true,
      false,
      true,
      true
  };

  static final String[] denormInputValues = {
      "radar",
      "Radar",
      "A man, a plan, a canal - Panama!",
      "A man, a plan, a dam - Hoover!",
      "aBbA"
  };

  static final boolean[] denormExpectedValues = {
      true,
      true,
      true,
      false,
      true
  };

  @Test
  void testRecursive() {
    for (int i = 0; i < inputValues.length - 1; i++) {
      String input = inputValues[i];
      boolean expected = expectedValues[i];
      boolean actual = Palindromes.testRecursive(input);
      assertEquals(expected, actual);
    }
  }

  @Test
  void testDenormalized() {
    for (int i = 0; i < denormInputValues.length - 1; i++) {
      String input = denormInputValues[i];
      boolean expected = denormExpectedValues[i];
      boolean actual = Palindromes.testDenormalized(input);
      assertEquals(expected, actual);
    }
  }
}