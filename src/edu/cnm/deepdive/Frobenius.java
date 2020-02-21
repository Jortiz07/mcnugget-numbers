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

//    if (value < 0) {
//      return false;
//    } else if (value == 0 || value % 6 == 0 || value % 9 == 0 || value % 20 == 0) {
//      return true;
//    } else if ((value - 6) % 9 == 0 || (value - 6) % 20 == 0) {
//      return true;
//    } else if ((value - 9) % 6 == 0 || (value - 9) % 20 == 0) {
//      return true;
//    } else if ((value - 20) % 6 == 0 || (value - 20) % 9 == 0) {
//    return true;}
//      return false;
    }
  }
