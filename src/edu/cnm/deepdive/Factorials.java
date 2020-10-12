package edu.cnm.deepdive;

import java.math.BigInteger;

/**
 * Implements computation of factorials. {@code computeRecursive} is a recursive implementation,
 * while {@code computeIterative} is an iterative implementation. Both can deal with large input
 * values, as the return types are {@code BigInteger}.
 */
public class Factorials {

  /**
   * Computes the factorial (n!) of a number {@code n}. Uses a recursive implementation.
   * @param n The integer for which to compute the factorial.
   * @return The result of the factorial, of type {@code BigInteger}.
   */
  public static BigInteger computeRecursive(int n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    return (n <= 1)? BigInteger.ONE : (computeRecursive(n - 1).multiply(BigInteger.valueOf(n)));
  }

  /**
   * Computes the factorial (n!) of a number {@code n}. Uses a iterative implementation.
   * @param n The integer for which to compute the factorial.
   * @return The result of the factorial, of type {@code BigInteger}.
   */
  public static BigInteger computeIterative(int n) {
    BigInteger result = BigInteger.ONE;
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    for (int i = 1; i <= n; i++) {
      result = result.multiply(BigInteger.valueOf(i));
    }
    return result;
  }

}
