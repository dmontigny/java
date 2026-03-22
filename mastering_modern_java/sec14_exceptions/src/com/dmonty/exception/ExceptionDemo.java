/* #############################################################################
 * @Filename        : ExceptionDemo.java
 * @Created         : Tue 2026-03-03 17:06:28-0500
 * @Modified        : Sat 2026-03-21 12:27:39-0400
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac ExceptionDemo.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/
package com.dmonty.exception;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionDemo {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    Scanner scanner = new Scanner(System.in);
    int num = 0;

    try {
      System.out.print("Enter a number: ");
      num = scanner.nextInt();

      System.out.println("Number: " + num);

      scanner.close();
    } catch(InputMismatchException ex) {
      System.out.println("Error: " + ex.getCause());
      ex.printStackTrace();
      System.out.println("InputMismatchException handled...");
    } catch(Exception ex) {
      System.out.println("Please provide an integer for input.");
    } finally {
      System.out.println("Executing finally block.");
      if(scanner != null) {
        scanner.close();
      }
    }

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main
} // ExceptionDemo


