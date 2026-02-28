/* #############################################################################
 * @Filename        : ConcatExercise.java
 * @Created         : Fri 2026-02-27 20:59:55-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac ConcatExercise.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

/**
 * You have couple of String variables and a int variable with the names
 *  pizzaSize, pizzaToppings, numberOfSlices . Using the String concatenation
 *  and the above variables, build a String that holds below value and finally
 *  print the same onto the console.
 *
 *    I would like to order a large pizza with pepperoni toppings, please. Oh,
 *      and cut it into 8 slices! 🍕
 *
 *  Expected Output:
 *    I would like to order a large pizza with pepperoni toppings, please. Oh,
 *      and cut it into 8 slices! 🍕
 */
public class ConcatExercise {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    String pizzaSize = "large";
      String pizzaToppings = "pepperoni";
      int numberOfSlices = 8;

      // Construct the pizza order message using string concatenation
      System.out.println("I would like to order a " + pizzaSize +
          " pizza with " + pizzaToppings + " toppings, please. Oh, and cut " +
          "it into " + numberOfSlices + " slices! 🍕");

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main
} // ConcatExercise


