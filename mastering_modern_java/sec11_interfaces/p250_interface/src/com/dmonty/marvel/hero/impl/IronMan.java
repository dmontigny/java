/* #############################################################################
 * @Filename        : IronMan.java
 * @Created         : Mon 2026-03-02 20:47:07-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac IronMan.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/
package com.dmonty.marvel.hero.impl;

import com.dmonty.marvel.her.SuperHero;

public class IronMan implements SuperHero {
  @Override
  public String usePower() {
    return "IronMan using his power.";
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
      return "IronMan killed the villain.";
    } else {
      return "IronMan stopped the villain.";
    }
  } // stopVillain
} // IronMan


