/* #############################################################################
 * @Filename        : StringComparison.java
 * @Created         : Thu 2026-02-26 19:25:03-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac StringComparison.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

/**
 * Compare the two Strings ignoring their case and print the result on to
 *  the console.
 */
public class StringComparison {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    String str1 = "Java Developer"; 
    String str2 = "java developer"; 

    System.out.println(str1.equalsIgnoreCase(str2));

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  }
} // StringComparison


