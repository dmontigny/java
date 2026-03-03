/* #############################################################################
 * @Filename        : ScannerMathOps.java
 * @Created         : Tue 2026-03-03 16:16:14-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac ScannerMathOps.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/
import java.util.Scanner;

public class ScannerMathOps {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    // Declare the object of Scanner
    Scanner sc = new Scanner(System.in);
    int num1, num2, opt;

    System.out.println("Welcome to Arithmetic Operations using Scanner!");
    System.out.print("Please enter the first number: ");
    
    // Accept first number num1 here
    num1 = sc.nextInt();

    System.out.print("Please enter the second number: ");
    
    // Accept second number num2 here
    num2 = sc.nextInt();

    System.out.println("Which operation would you like to perform?");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.print("Enter your choice (1/2/3/4): ");
    
    // Accept Arithmetic operation choice here and perform the operation     
    opt = Integer.valueOf(sc.nextInt());
    switch(opt) {
      case 1:
        System.out.println(num1 + num2);
        break;
      case 2:
        System.out.println(num1 - num2);
        break;
      case 3:
        System.out.println(num1 * num2);
        break;
      case 4:
        System.out.println(num1 / num2);
        break;
    }

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main
} // ScannerMathOps


