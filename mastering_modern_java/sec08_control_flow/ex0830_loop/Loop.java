/* #############################################################################
 * @Filename        : Loop.java
 * @Created         : Sun 2026-03-01 07:24:34-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac Loop.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class Loop {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    System.out.println(sumOfNumbers(100));

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main

  /**
   * You have a static method sumOfNumbers which accepts an int variable number.
   *  Write a logic inside this method using for loop to sum all the natural
   *  numbers from 1 to given input number.
   *
   *  Expected Output:
   *    100 -> 5050
   *    1000 -> 500500
   */
  public static long sumOfNumbers(int number) {
    long sum = 0;

    for(int i = 0; i <= number; i++) {
      sum += i;
    }

    return sum;
  }
} // Loop


