/* #############################################################################
 * @Filename        : AcceptAgeDetails.java
 * @Created         : Mon 2026-03-23 09:07:50-0400
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac AcceptAgeDetails.java
 * @Description     : 
 * ###########################################################################*/

/* ============================== import files ===============================*/
import java.util.Scanner;
import com.dmonty.exception.custom.InvalidAgeException;

/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class AcceptAgeDetails {
  public static void main(String[] args) throws Exception {
    System.out.println("\nProgram starting\n");  

    Scanner scanner = new Scanner(System.in);
    int age;

    System.out.print("Enter your age: ");
    age = scanner.nextInt();
    if( age < 0 || age > 125) {
      throw new InvalidAgeException("Invalid age. Please enter an age from 0 to 125.");
    }

    System.out.println("Your age is: " + age);

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main
} // AcceptAgeDetails


