/* #############################################################################
 * @Filename        : BreakLoop.java
 * @Created         : Sun 2026-03-01 07:51:20-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac BreakLoop.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class BreakLoop {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    System.out.println(findDivisibleNumber(2, 5));

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main

  /**
   * You have a static method findDivisibleNumber which accepts two int
   *  variables num1, num2. Write a logic inside this method using a while loop
   *  and break statement to identify the first positive natural number that is
   *  exactly divisible by num1 and num2.
   *
   * Expected Output:
   *  num1 = 2, num2 = 3 -> 6
   *  num1 = 2, num2 = 5 -> 10
   */
  public static int findDivisibleNumber(int num1, int num2) {
    int i = 1;

    while(true) {
      if(i % num1 == 0 && i % num2 == 0) {
        break;
      }
      i++;
    }

    return i;
  }
} // BreakLoop


