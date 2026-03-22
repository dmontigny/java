/* #############################################################################
 * @Filename        : DivideThrow.java
 * @Created         : Sun 2026-03-22 09:33:36-0400
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac DivideThrow.java
 * @Description     : 
 * ###########################################################################*/

/* ============================== import files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class DivideThrow {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    Division div = new Division();
    double res;

    try {
      res = div.divide("5", "0");
      System.out.println("Quotient: " + res);
    } catch (NumberFormatException | ArithmeticException ex) {
      System.out.println("Invalid data provided.");
    }

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main
} // DivideThrow


