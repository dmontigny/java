/* #############################################################################
 * @Filename        : StringConcatenator.java
 * @Created         : Thu 2026-02-26 18:45:39-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac StringConcatenator.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

/**
 * Create a Java class named "StringConcatenator" with a main method. In this
 *  class implement string concatenation logic to combine multiple strings into
 *  one coherent message. The goal is to showcase the versatility of Java's
 *  string manipulation capabilities. Finally, print the concatenated message
 *  to the console, demonstrating the power of string manipulation in Java.
 *
 * Steps:
 *  1.  Create a Java class with the name StringConcatenator.
 *  2.  Build main method inside the StringConcatenator class.
 *  3.  Create three String variables inside main method with the below names
 *        and values inside them:
 *       greeting ->  Hello
 *       name -> Alex
 *       message -> Welcome to elite Java Club!
 *  4.  Finally concat all the above String variables and assign the output to
 *        a String variable personalizedMessage.
 *  5.  Print the personalizedMessage on to the console.
 */
public class StringConcatenator {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    String greeting = "Hello,";
    String name = "Alex.";
    String message = "Welcome to elite Java Club!";

    String personalizedMessage = greeting + name + message;

    System.out.println(personalizedMessage);

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  }
} // StringConcatenator


