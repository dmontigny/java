/* #############################################################################
 * @Filename        : EvenOdd.java
 * @Created         : Fri 2026-02-27 21:18:09-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac Even_Odd.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class EvenOdd {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    System.out.println("14 -> " + checkEven(14));     
    System.out.println("7 -> " + checkEven(7));     

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main

/**
 * You have a static method  checkEven that accepts a int value as an input.
 *  Write a logic inside this method using modulus operator and if, else
 *  statement to identify if the given provided number is a even or odd number.
 * If the given number is a even number, the method should return a String
 *  value "EVEN",otherwise "ODD"
 *
 * Expected Output:
 *  14 -> EVEN
 *  7 -> ODD
 */
  public static String checkEven(int inputNum) {
    // Write your code below
    if(inputNum % 2 == 0) {
      return "EVEN";
    }

    return "ODD";
  }
} // EvenOdd

