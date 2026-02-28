/* #############################################################################
 * @Filename        : SurpriseGift.java
 * @Created         : Fri 2026-02-27 05:47:39-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac SurpriseGift.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

/**
 * You have a String variable with the name gift. Extract the substring value
 *  Surprise! from it and print the same on to the console.
 */
public class SurpriseGift {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    String gift = "Surprise! It's a puppy!";

    System.out.println(gift.substring(0, 9));

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  }
} // SurpriseGift


