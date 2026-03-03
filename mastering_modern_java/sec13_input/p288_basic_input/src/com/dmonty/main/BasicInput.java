/* #############################################################################
 * @Filename        : BasicInput.java
 * @Created         : Tue 2026-03-03 13:00:45-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac BasicInput.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

import java.io.IOException;

public class BasicInput {
  public static void main(String[] args) throws IOException {
    System.out.println("\nProgram starting\n");
    int num;

    System.out.print("Please enter a value: ");
    num = Integer.valueOf(System.in.read());

    System.out.println(num + " was entered.");

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main
} // BasicInput


