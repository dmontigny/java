/* #############################################################################
 * @Filename        : DivideByZeroException.java
 * @Created         : Wed 2026-04-29 16:08:22-0400
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac DivideByZeroException.java
 * @Description     : 
 * ###########################################################################*/

/* ============================== import files ===============================*/
package com.dmonty.exception.custom;

/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class DivideByZeroException extends RuntimeException {
  public DivideByZeroException() {
    super();
  }

  public DivideByZeroException(String msg) {
    super(msg);
  }
} // DivideByZeroException


