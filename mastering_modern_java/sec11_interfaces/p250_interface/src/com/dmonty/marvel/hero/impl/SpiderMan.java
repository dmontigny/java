/* #############################################################################
 * @Filename        : SpiderMan.java
 * @Created         : Mon 2026-03-02 21:01:05-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac SpiderMan.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/
package com.dmonty.marvel.hero.impl;

import com.dmonty.marvel.hero.SuperHero;

public class SpiderMan implements SuperHero {
  @Override
  public String usePower() {
    return "SpiderMan using his power.";
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
      return "SpiderMan killed the villain.";
    } else {
      return "SpiderMan stopped the villain.";
    }
  } // stopVillain
} // SpiderMan


