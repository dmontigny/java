/* #############################################################################
 * @Filename        : FloatToString.java
 * @Created         : Thu 2026-02-26 20:52:33-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac FLoatToString.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/
/**
 * On the right hand side, you have a float variable with the name price.
 *  Convert the same into a String and print the output on to the console.
 */
public class FloatToString {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    float price = 9.99f;

    System.out.println(String.valueOf(price));

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  }
} // FLoatToString


