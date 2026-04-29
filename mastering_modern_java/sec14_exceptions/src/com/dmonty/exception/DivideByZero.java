/* #############################################################################
 * @Filename        : DivideByZero.java
 * @Created         : Wed 2026-04-29 16:12:44-0400
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac DivideByZero.java
 * @Description     : 
 * ###########################################################################*/

/* ============================== import files ===============================*/
import java.util.Scanner;

import com.dmonty.exception.custom.DivideByZeroException;

/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class DivideByZero {
//  public static void main(String[] args) throws DivideByZeroException {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter a numerator value: ");
    int numer = scanner.nextInt();

    System.out.print("Please enter a denominator value: ");
    int denom = scanner.nextInt();
    if(denom == 0) {
      throw new DivideByZeroException("Error: Denminator cannot equal zero.");
    }

    int res = numer / denom;
    System.out.println("The result is " + res);

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main
} // DivideByZero


