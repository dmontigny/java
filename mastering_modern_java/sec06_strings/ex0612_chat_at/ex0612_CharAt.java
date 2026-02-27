/* #############################################################################
 * @Filename        : ex0612_CharAt.java
 * @Created         : Thu 2026-02-26 19:54:21-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac ex0612_CharAt.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

/**
 * On the right hand side, you have a String variable with the name message.
 *    Extract the char ! from the String value and print the same
 *    on the console.
 */
public class ex0612_CharAt {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    String message = "Java is fun!"; 

    System.out.println(message.charAt(message.length() - 1));

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  }
} // ex0612_CharAt


