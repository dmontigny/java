/* #############################################################################
 * @Filename        : CaptainAmerica.java
 * @Created         : Mon 2026-03-02 21:03:36-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac CaptainAmerica.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/
package com.dmonty.marvel.hero.impl;

import com.dmonty.marvel.hero.SuperHero;

public class CaptainAmerica implements SuperHero {
  @Override
  public String usePower() {
    return "CaptainAmerica using his power.";
  } // usePower

  /**
   * @param:
   *  if y: kill the villain
   *   if n: stop the villain
   * @return: status
   */
  @Override
  public String stopVillain(char c) {
    if( c == 'y') {
      return "CaptainAmerica killed the villain.";
    } else {
      return "CaptainAmerica stopped the villain.";
    }
  } // stopVillain
} // CaptainAmerica



