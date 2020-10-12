package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

/**
 * Implements test methods for the methods of the {@link Factorials} class.
 */
class FactorialsTest {
  static final int[] inputValues = {
      0,
      1,
      5,
      10,
      13
  };
  
  static final long[] expectedValues = {
      1,
      1,
      120,
      3628800,
      6227020800L
  };

  /**
   * Tests the computeRecursive function with arrays of input values and expected values.
   */
  @Test
  void computeRecursive() {
    for (int i = 0; i < inputValues.length; i++) {
      int input = inputValues[i];
      BigInteger expected = BigInteger.valueOf(expectedValues[i]);
      BigInteger actual = Factorials.computeRecursive(input);
      assertEquals(expected, actual);
    }
  }

  /**
   * Asserts that the computeRecursive function throws an exception for non-positive integer values.
   */
  @Test
  void computeRecursive_exception() {
    assertThrows(IllegalArgumentException.class, () -> Factorials.computeRecursive(-1));
  }

  /**
   * Tests the computeIterative function with arrays of input values and expected values.
   */
  @Test
  void computeIterative() {
    for (int i = 0; i < inputValues.length; i++) {
      int input = inputValues[i];
      BigInteger expected = BigInteger.valueOf(expectedValues[i]);
      BigInteger actual = Factorials.computeIterative(input);
      assertEquals(expected, actual);
    }
  }
}