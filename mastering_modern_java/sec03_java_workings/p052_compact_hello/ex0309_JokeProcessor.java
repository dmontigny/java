/* #############################################################################
 * @Filename        : ex0309_JokeProcessor.java
 * @Created         : Mon 2026-02-23 19:21:35-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : java JokeProcessor.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

/*
 * Generate a Joke using a Java class, main method and String variable
 * Scenario:
 *  In a futuristic world where robots have taken over mundane tasks, there
 *    exists a quirky Java program called "LaughBot". LaughBot's primary
 *    function is to generate and share jokes with its fellow robots to keep
 *    their circuits buzzing with laughter.
 *
 * Code Assignment:
 *  LaughBot, the ever-enthusiastic robot, receives a new assignment to create a
 *    Java class named "JokeProcessor" with a main method. In this class,
 *    LaughBot must declare a String variable named "hilariousJoke" and assign
 *    it a rib-tickling joke "Why don't programmers like nature? It has too
 *    many bugs!". Finally, LaughBot enthusiastically prints out the joke to
 *    the console, spreading joy in the robotic community.
 */

public class ex0309_JokeProcessor {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    String hilariousJoke = 
      "Why don't programmers like nature? It has too many bugs!" ;

    System.out.println(hilariousJoke);

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  }
} // main


