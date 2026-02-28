/* #############################################################################
 * @Filename        : SwitchCase.java
 * @Created         : Sat 2026-02-28 15:04:21-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac SwitchCase.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class SwitchCase {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    System.out.println("HAPPY -> " + moodAnalyzer("HAPPY"));

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main

  /**
   * You have a static method  moodAnalyzer that accepts a String value as an
   *  input. Write a logic inside this method using Switch expression  to res =
   *  an emoji expression based on the mood provided.
   *
   *  Expected Output:
   *    "HAPPY" -> "😀"
   *    "SAD" -> "😞"
   *    "TIRED" -> "🥱"
   *    "EXCITED" -> "😱"
   *    default -> "🤔"
   */
  public static String moodAnalyzer(String mood) {
    String res;

    switch(mood) {
      case "HAPPY":
        res = "😀";
        break;
      case "SAD":
        res = "😞";
        break;
      case "TIRED":
        res = "🥱";
        break;
      case "EXCITED":
        res = "😱";
        break;
      default:
        res = "🤔";
    }

    return res;
  } // moodAnalyzer
} // SwitchCase


