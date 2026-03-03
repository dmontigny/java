/* #############################################################################
 * @Filename        : SuperHero.java
 * @Created         : Mon 2026-03-02 20:36:58-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac SuperHero.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/
package com.dmonty.marvel.hero;

public interface SuperHero extends Hero, Person {
  String UNIVERSE_NAME = "Marvel";
  String usePower();

  /**
   * @param:
   *  if y: kill the villain
   *   if n: stop the villain
   * @return: status
   */
  String stopVillain(char c);
    
     

} // SuperHero


