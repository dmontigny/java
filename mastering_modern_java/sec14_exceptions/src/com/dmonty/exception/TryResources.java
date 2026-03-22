/* #############################################################################
 * @Filename        : TryResources.java
 * @Created         : Sat 2026-03-21 12:40:20-0400
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac TryResources.java
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

public class TryResources {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");

    int num = 0;

    try( Scanner scanner = new Scanner(System.in);) {
      System.out.print("Enter a number: ");
      num = scanner.nextInt();

      System.out.println("Number: " + num);
    } catch(InputMismatchException ex) {
      System.out.println("Error: " + ex.getCause());
      ex.printStackTrace();
      System.out.println("InputMismatchException handled...");
    } catch(Exception ex) {
      System.out.println("Please provide an integer for input.");
    } finally {
      System.out.println("Executing finally block.");
    }

    System.out.println("\nProgram ending\n");
    System.exit(0);
  } // main
} //
