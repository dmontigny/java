/* #############################################################################
 * @Filename        : JavaDocDemo.java
 * @Created         : Thu 2026-02-26 15:03:09-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac JavaDocDemo.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

/**
 * This is a sample class ro show demo about javadoc
 *
 * <P>
 *  This ia a sample <b>paragraph</b>
 * </p>
 *
 * @author: David L. Montigny
 * @since 1.0.0
 */
public class JavaDocDemo {
  /**
   * The main function
   *
   */
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

     

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  }

  /**
   * This function adds 2 numbers
   *
   * @param num1 First number
   * @param num2 Second number
   * @return sum of num1 and num2
   */
  public int sum(int num1, int num2) {
    return num1 + num2;
  }
} // JavaDocDemo


