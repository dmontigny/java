/* #############################################################################
 * @Filename        : OutOfBounds.java
 * @Created         : Tue 2026-03-03 17:13:05-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac OutOfBounds.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/
package com.dmonty.exception;

import java.util.logging.Level;
import java.util.logging.Logger;

public class OutOfBounds {

  private static Logger logger = Logger.getLogger(OutOfBounds.class.getName());

  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    int[] nums = {1, 2, 3, 4, 5};
    int tgt = nums.length + 5;

    try {
      System.out.println(nums[tgt]);
    } catch (ArrayIndexOutOfBoundsException ex) {
      logger.severe("Invalid array index.");
      System.out.println("Invalid array index: " + tgt + ".");
    }

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main
} // OutOfBounds


