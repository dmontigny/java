/* #############################################################################
 * @Filename        : NestedTry.java
 * @Created         : Mon 2026-03-23 08:23:34-0400
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac NestedTry.java
 * @Description     : 
 * ###########################################################################*/

/* ============================== import files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class NestedTry {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    nestedTryBlock(); 

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main

  static void nestedTryBlock() {
    try {
      System.out.println("Outer try block start");

      try {
      System.out.println("Inner try block start");
      // Simulate arithmetic
      int res = 10 / 0;
      System.out.println("Inner try block end");
      } catch (ArithmeticException e) {
        System.out.println("ArithmeticException caught by inner try block:" + 
            e.getMessage());
      } finally {
        System.out.println("Inner try block: finally block.");
      }

      System.out.println("Outer try block end");
    } catch(ArithmeticException e) {
      System.out.println("ArithmeticException caught by outer try block:" + 
          e.getMessage());
    } finally {
      System.out.println("Outer try block: finally block.");
    }
  } // nestedTryBlock
} // NestedTry


