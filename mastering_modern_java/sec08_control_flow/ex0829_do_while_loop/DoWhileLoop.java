/* #############################################################################
 * @Filename        : DoWhileLoop.java
 * @Created         : Sun 2026-03-01 06:22:06-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac DoWhileLoop.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class DoWhileLoop {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  
  
    System.out.println(calculateFactorial(4));

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main

  /**
   * You have a static method calculateFactorial that accepts a int variable n.
   *  Write logic inside this method using a do while loop to calculate the
   *  factorial of the given number and return the same.
   * A factorial of a non-negative integer n, denoted as n!, is the product of
   *  all positive integers less than or equal to n.
   * In mathematical terms, the factorial of n is calculated as:
   *  n!= n * (n − 1) * (n − 2) * ... * 2 * 1
   *
   * For example:
   *  0!=1 (by convention)
   *  1!=1
   *  2!=2×1=2
   *  3!=3×2×1=6
   *  4!=4×3×2×1=24
   *  and so on...
   */
  public static long calculateFactorial(int n) {
    long factorial = 1;
    int number = 1;

    // Write your logic below using do while
    if(n <= 1) {
      return 1;
    }

    do {
      factorial *= number++;
    } while(number <= n);
    
    return factorial;
  }
} // DoWhileLoop


