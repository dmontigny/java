/* #############################################################################
 * @Filename        : CharAtMethod.java
 * @Created         : Thu 2026-02-26 19:41:14-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac CharAtMethod.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class CharAtMethod {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    String java = "JAVA";

    System.out.println(java.charAt(0));

    // esception: out of bounds
    // System.out.println(java.charAt(4));
    
    System.out.println("\nProgram ending\n");  
    System.exit(0);
  }
} // CharAtMethod


