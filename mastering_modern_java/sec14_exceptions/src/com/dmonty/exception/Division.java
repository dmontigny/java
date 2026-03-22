/* #############################################################################
 * @Filename        : Division.java
 * @Created         : Sun 2026-03-22 09:20:53-0400
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Description     : 
 * ###########################################################################*/

/* ============================== import files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class Division {
  public double divide(String num1, String num2)
      throws NumberFormatException, ArithmeticException {
    int n1 = Integer.parseInt(num1);
    int n2 = Integer.parseInt(num2);

    System.out.println("Dividing...");

    return (double)n1 / n2;
  }
} // Division


