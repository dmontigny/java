/* #############################################################################
 * @Filename        : InvalidAgeException.java
 * @Created         : Wed 2026-04-29 14:30:46-0400
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac p320_custom_checked_exception_class.java
 * @Description     : 
 * ###########################################################################*/

/* ============================== import files ===============================*/
package com.dmonty.exception.custom;

/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class InvalidAgeException extends Exception {
  public InvalidAgeException() {
    super();
  } // CustomCheckedException

  public InvalidAgeException(String message) {
    super(message);
  } // InvalidAgeException
} // InvalidException


