/* #############################################################################
 * @Filename        : EvenOdd.java
 * @Created         : Tue 2026-03-03 13:45:26-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac EvenOdd.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/
package com.dmonty.input;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class EvenOdd {
  public static void main(String[] args) throws IOException {
    System.out.println("\nProgram starting\n");  

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader bf = new BufferedReader(isr);
    int num1, num2;

    System.out.print("Please enter a value: ");
    num1 = Integer.valueOf(bf.readLine());
    System.out.print("Please enter another value: ");
    num2 = Integer.valueOf(bf.readLine());
    bf.close();

    System.out.println(num1 + (num1 % 2 == 0 ? " is even." : " is odd."));
    System.out.println(num2 + (num2 % 2 == 0 ? " is even." : " is odd."));
    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main
} // EvenOdd


