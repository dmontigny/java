/* #############################################################################
 * @Filename        : EmojiDetector.java
 * @Created         : Thu 2026-02-26 21:06:38-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac EmojiDetector.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

/**
 * On the right hand side, you have a String variable with the name message.
 *  Validate the String value if it contains 😊 using contains method and
 *  print the boolean output on to the console.
 */

public class EmojiDetector {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    String message = "I love coding! 😊";

    System.out.println(message.contains("😊"));

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  }
} // EmojiDetector


