/* #############################################################################
 * @Filename        : UncheckedException.java
 * @Created         : Sun 2026-03-22 08:36:34-0400
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac UncheckedException.java
 * @Description     : 
 * ###########################################################################*/

/* ============================== import files ===============================*/
import java.io.IOException;

/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class UncheckedException {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    String input = null;

    try {
      input = "DMonty";
      System.out.println(input);
      input = input.toUpperCase();
      System.out.println(input);
      input = input.substring(1, 10);
      System.out.println(input);
    } catch(java.lang.StringIndexOutOfBoundsException ex) {
      System.out.println("Error handled");
    }


    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main
} // UncheckedException


