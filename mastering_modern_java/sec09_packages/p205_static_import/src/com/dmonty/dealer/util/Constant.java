/* #############################################################################
 * @Filename        : Constant.java
 * @Created         : Mon 2026-03-02 11:38:32-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac Constant.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/
package com.dmonty.dealer.util;

public class Constant {
  public static final double TAX_RATE = 0.07;
  public static final double SHIPPING = 595.99;
  
  public Constant() {

  } // Constant default

  public static double calcTotalCost(double price) {
    return price + price * TAX_RATE + SHIPPING; 
  } // calcTotalCost
} // Constants


