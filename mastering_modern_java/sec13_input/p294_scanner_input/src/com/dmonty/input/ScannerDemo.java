/* #############################################################################
 * @Filename        : ScannerDemo.java
 * @Created         : Tue 2026-03-03 15:55:21-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac ScannerDemo.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/
package com.dmonty.input;

import java.util.Scanner;

public class ScannerDemo {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    Scanner sc = new Scanner(System.in);
    String name;
    int age;

    System.out.print("Enter your name: ");
    name = sc.next();

    System.out.print("Enter your age: ");
    age = sc.nextInt();

    System.out.println("Hello, " + name + ". You are " + age + " years old.");

    sc.close();

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main
} // ScannerDemo


