/* #############################################################################
 * @Filename        : StringToDouble.java
 * @Created         : Fri 2026-02-27 20:22:59-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac StringToDouble.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

/**
 * You have a String variable with the name priceInString with a double value
 *  inside it. Convert the same into a double numeric value with the help of
 *  parsing and print the double variable on to the console.
 */
public class StringToDouble {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    String priceInString = "999.99";
    // Write your code below

    System.out.println(Double.parseDouble(priceInString));

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  }
} // StringToDouble


