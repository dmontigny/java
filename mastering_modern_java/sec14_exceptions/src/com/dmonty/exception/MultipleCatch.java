/* #############################################################################
 * @Filename        : MultipleCatch.java
 * @Created         : Tue 2026-03-03 17:13:05-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac MultipleCatch.java
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

public class MultipleCatch {

  private static Logger logger = Logger.getLogger(MultipleCatch.class.getName());

  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    String input = null;
    
    try {
      input = "DMonty";
      input = input.toUpperCase();
      logger.info(input);
      input = input.substring(1, 10);
      logger.info(input);
    } catch (StringIndexOutOfBoundsException | 
        ArrayIndexOutOfBoundsException ex) {
      logger.severe("Index out of bounds: Check index value.");
    } catch (NullPointerException ex) {
      logger.severe("Null pointer exception: Check data.");
    } catch (Exception ex) {
      logger.severe("Unhandled exception.");
    } 

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main
} // OutOfBounds


