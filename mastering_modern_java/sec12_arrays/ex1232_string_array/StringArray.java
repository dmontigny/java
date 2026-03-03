/* #############################################################################
 * @Filename        : StringArray.java
 * @Created         : Tue 2026-03-03 08:56:12-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac StringArray.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class StringArray {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    storeStringsInArray();     

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main

  /**
   * You have a static method storeStringsInArray which accepts no input
   *  parameters and return a String array. Write a logic inside this method to
   *  store three Strings "Woof!", "Meow!", "Quack!" inside an array with the
   *  same order. Before you return this array from the method, please make
   *  sure to print the array length to the console.
   *
   * Expected Output:
   *  3
   *  ["Woof!", "Meow!", "Quack!"]
   */
  public static String[] storeStringsInArray() {
    String[] noises = new String[]{"Woof!", "Meow!", "Quack!"};

    System.out.println(noises.length);

    return noises;
  } // storeStringsInArray
} // StringArray


