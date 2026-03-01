/* #############################################################################
 * @Filename        : WhileLoop.java
 * @Created         : Sun 2026-03-01 06:12:17-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac WhileLoop.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class WhileLoop {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    System.out.println(sumOfFirst100Numbers());

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main

  /**
   * You have a static method sumOfFirst100Numbers. Write logic inside this method
   *  a using while loop to sum all the natural numbers from 1 to 100.
   *
   * Expected Output:
   *  5050
   */
  public static int sumOfFirst100Numbers() {
    int sum = 0;
    int number = 1;

    // Write your logic below
    while(number <= 100) {
      sum += number;
      number++;
    }

    return sum;
  } // sumOfFirst100Numbers
} // WhileLoop
