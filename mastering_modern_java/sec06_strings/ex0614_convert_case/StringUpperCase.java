/* #############################################################################
 * @Filename        : StringUpperCase.java
 * @Created         : Thu 2026-02-26 20:17:52-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac StringUpperCase.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

/**
 * On the right hand side, you have a String variable with the name text.
 *  Convert it's content into uppercase chars and print the output on to the
 *  console.
 */
public class StringUpperCase {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    String text = "Java is fun";

    System.out.println(text.toUpperCase());

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  }
} // StringUpperCase


