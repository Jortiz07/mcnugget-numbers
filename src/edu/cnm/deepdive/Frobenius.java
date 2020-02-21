package edu.cnm.deepdive;

public class Frobenius {

  /* Pack sizes  are 6, 9, 20. */
  public static boolean isMcNugget(int value) {
    if (value < 0) {
      return false;
    }
    return value >= 0 && (value == 0
        || isMcNugget(value - 6)
        || isMcNugget(value - 9)
        || isMcNugget(value - 20));
    }
    /**
     * Return true if the stated value can be formed as a sum of non-negative integral multiples of
     * the elements of packSizes.
     *
     * @param value target/goal number.
     * @param packSize array of distinct, positive pack sizes, in descending order.
     * @return true if value is a McNuggets number using the specific pack sizes, false otherwise.
    */
    public static boolean isGeneralMcNuggest(int value, int[] packSize) {
    return false; // TODO Complete implementation for extra credit.
    }
  }
