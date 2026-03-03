/* #############################################################################
 * @Filename        : BufferedReaderDemo.java
 * @Created         : Tue 2026-03-03 13:16:31-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac BufferedReader.java
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

public class BufferedReaderDemo {
  public static void main(String[] args) throws IOException {
    System.out.println("\nProgram starting\n");  

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader bf = new BufferedReader(isr);
    int num;

    System.out.print("Please enter a value: ");
    num = Integer.valueOf(bf.readLine());
    bf.close();

    System.out.println(num + " was entered.");

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main
} // BufferedReader


