/* #############################################################################
 * @Filename        : IfElse.java
 * @Created         : Fri 2026-02-27 21:41:42-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac IfElse.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

/**
 * You have a static method isRaining that accepts a boolean value as an
 *  input. Write a logic inside this method using logical NOT operator and if,
 *  else statements to identify if it is raining or not.
 * If it is raining, the method should return a String value "I guess it's
 *  another day for indoor activities!" ,otherwise "I'll go for a walk."
 *
 * Expected Output:
 *  !raining -> I'll go for a walk.
 *  raining -> I guess it's another day for indoor activities!
 */
public class IfElse {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    boolean raining = true;

    System.out.println("!raining -> " + isRaining(!raining));
    System.out.println("raining -> " + isRaining(raining));

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main

  public static String isRaining(boolean raining) {
    if(!raining) {
      return "I'll go for a walk.";
    }

    return "I guess it's another day for indoor activities!";
  }
} // IfElse


