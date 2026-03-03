/* #############################################################################
 * @Filename        : ForEachLoop.java
 * @Created         : Tue 2026-03-03 09:26:10-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac ForEachLoop.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class ForEachLoop {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    printAnimalSounds(); 

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main

  /**
   * You have a static method  printAnimalSounds which accepts no input
   *  parameters and return void. Inside this method you have a String array.
   *  Iterate over this array using for loop or for each and during the each
   *  iteration, convert the String to upper case followed by printing the same
   *  to the console.
   *
   *  Expected Output:
   *    "MOO!"
   *    "BAA!"
   *    "OINK!"
   *    "MEOW!"
   *    "WOOF!
   */
  public static void printAnimalSounds() {
    String[] animalSounds = {
      "Moo!",
      "Baa!",
      "Oink!",
      "Meow!",
      "Woof!"
    };

    // Write the iteration logic below
    for(String sound: animalSounds) {
      System.out.println(sound.toUpperCase());
    }
  }
} // ForEachLoop


