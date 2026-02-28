/* #############################################################################
 * @Filename        : AdditionExercise.java
 * @Created         : Fri 2026-02-27 20:54:09-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac AdditionExercise.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

/**
 * You have a multiple int variables startingTreasure, clue1, clue2, clue3
 *  holding various int values inside them. Add all of them using addition
 *  operator. The total sum value should be printed on to the console.
 *
 *  Expected Output:
 *    4250
 */
public class AdditionExercise {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    int startingTreasure = 1000; // Initial treasure
    int clue1 = 500; // Treasure found after solving the first clue
    int clue2 = 750; // Treasure found after solving the second clue
    int clue3 = 2000; // Treasure found after solving the final clue

    // Calculate the total treasure found and print the same on to the console
    System.out.println(startingTreasure + clue1 + clue2 + clue3);

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main
} // AdditionExercise


