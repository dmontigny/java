/* #############################################################################
 * @Filename        : EmptyString.java
 * @Created         : Thu 2026-02-26 20:04:47-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac EmptyString.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

/**
 * On the right hand side, you have couple of String variables with the name
 *  text and emptyString. Validate if these Strings are empty or not and print
 *  the output in the same order.
 */
public class EmptyString {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    String text = "Hello, Java!";
    String emptyString = "";

    System.out.println(text.isEmpty());
    System.out.println(emptyString.isEmpty());

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  }
} // EmptyString


