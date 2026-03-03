/* #############################################################################
 * @Filename        : Additon.java
 * @Created         : Tue 2026-03-03 12:38:43-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac Additon.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/
package com.dmonty.main;

public class Additon {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    int len = args.length, sum = 0;

    for(int i = 0; i < len; i++) {
      sum += Integer.valueOf(args[i]);
    }

    System.out.println(sum);

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main
} // Additon


