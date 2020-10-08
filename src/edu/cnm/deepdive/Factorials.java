package edu.cnm.deepdive;

import java.math.BigInteger;

public class Factorials {

  public static BigInteger computeRecursive(int n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    return (n <= 1)? BigInteger.ONE : (computeRecursive(n - 1).multiply(BigInteger.valueOf(n)));
  }

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
