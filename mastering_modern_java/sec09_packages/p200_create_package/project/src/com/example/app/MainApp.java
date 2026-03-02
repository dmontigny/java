package com.example.app;
/* #############################################################################
 * @Filename        : MainApp.java
 * @Created         : Mon 2026-03-02 06:42:51-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac MainApp.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

import com.example.util.StringUtils;

public class MainApp {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    String original = "Hello, Java!";
    String reversed = StringUtils.reverse(original);

    System.out.println("Original: " + original);
    System.out.println("Reversed: " + reversed);    

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main
} // MainApp


