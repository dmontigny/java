/* #############################################################################
 * @Filename        : TernaryExercise.java
 * @Created         : Sat 2026-02-28 05:57:13-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac TernaryExercise.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class TernaryExercise {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  
    
    int score = 95;

    System.out.println(rankCalculator(score));

    score = 83;
    System.out.println(rankCalculator(score));

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main

  /**
  * You have a static method  rankCalculator  that accepts a int variable score
  *  as an input and return a String value as an output. Write a logic inside
  *  this method using ternary operator to calculate the rank based on the score.
  *  Below is the expected output.
  *
  *  Expected Output:
  *    score >= 90 -> "Grandmaster"
  *    score >= 80 -> "Master"
  *    score >= 70 -> "Expert"
  *    score >= 60 -> "Intermediate"
  *    score < 60 -> "Beginner"
  */
  public static String rankCalculator(int score) 
  {
    // Write your code below
    String res;
    int tgt = 90;
    
    res = (score >= (90)) ? "Grandmaster" : 
          (score >= (80)) ? "Master" : 
          (score >= (70)) ? "Expert" : 
          (score >= (60)) ? "Intermediate" : "Beginner"; 

    return res;
  } // rankCalculator
} // TernaryExercise

