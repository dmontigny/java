/* #############################################################################
 * @Filename        : FormatString.java
 * @Created         : Fri 2026-02-27 18:58:59-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac FormatString.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

/**
 * You have a String variables with the name item, quantity and pricePerUnit.
 *  Using these variable and printf method, display the message on to the
 *  console based on the expected output give below.
 */

public class FormatString {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

      String item = "bananas";
      int quantity = 7;
      double pricePerUnit = 1.99;

      // Write your code below
//      String.out.println("Don't forget to buy %d %s at $%0.2f each!");
      System.out.printf("Don't forget to buy %d %s at $%.2f each!", 
          quantity, item, pricePerUnit);

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  }
} // FormatString


