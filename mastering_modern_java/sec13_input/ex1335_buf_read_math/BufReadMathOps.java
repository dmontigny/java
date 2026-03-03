/* #############################################################################
 * @Filename        : BufReadMathOps.java
 * @Created         : Tue 2026-03-03 14:45:55-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac BufReadMathOps.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufReadMathOps {
/** You have a main method. Inside this method, write logic to accept two
 *    numbers and the Arithmetic operation to perform using BufferedReader. The
 *    println statements inside the method can provide you a hint at what place
 *    an input needs to be accepted using BufferedReader.
 *  Once the input numbers and arithmetic operation choice is accepted, perform
 *    the corresponding operation.
 *
 * Expected Output:
 *  num1 = 5, num2 = 3, choice = 1 -> Result = 8
 *  num1 = 5, num2 = 3, choice = 2 -> Result = 2
 *  num1 = 5, num2 = 3, choice = 3 -> Result = 15
 *  num1 = 5, num2 = 3, choice = 4 -> Result = 1
 */
  public static void main(String[] args) throws IOException {
    System.out.println("\nProgram starting\n");  

    // Declare the object of BufferedReader
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader bf = new BufferedReader(isr);
    int num1, num2, opt;

    System.out.println("Welcome to Arithmetic Operations using BufferedReader!");
    System.out.print("Please enter the first number: ");
    
    // Accept first number num1 here
    num1 = Integer.valueOf(bf.readLine());

    System.out.print("Please enter the second number: ");
    // Accept second number num2 here
    num2 = Integer.valueOf(bf.readLine());    

    System.out.println("Which operation would you like to perform?");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.print("Enter your choice (1/2/3/4): ");
    
    // Accept Arithmetic operation choice here and perform the operation     
    opt = Integer.valueOf(bf.readLine());
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
} // BufReadMathOps


