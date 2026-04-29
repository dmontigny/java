/* #############################################################################
 * @Filename        : ExceptionPropagation.java
 * @Created         : Mon 2026-03-23 07:43:53-0400
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac ExceptionPropagation.java
 * @Description     : 
 * ###########################################################################*/

/* ============================== import files ===============================*/
import java.io.FileNotFoundException;

/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class ExceptionPropagation {
  public static void main(String[] args) throws FileNotFoundException {
    System.out.println("\nProgram starting\n");  

    System.out.println("Main method start");
    method1();
    System.out.println("Main method exit");

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main

  static void method1() throws FileNotFoundException {
    System.out.println("method1 start");
    try {
      method2();
    } catch (FileNotFoundException ex) {
      System.out.println(ex.getMessage());
    }
    System.out.println("method1 end");
  } // method1

  static void method2() throws FileNotFoundException {
    System.out.println("method2 start");
    method3();
    System.out.println("method2 end");
  } // method2

  static void method3() throws FileNotFoundException {
    System.out.println("method3 start");
    throw new FileNotFoundException("Error: File not found.");
//    System.out.println("method3 end");
  } // method3

} // ExceptionPropagation


