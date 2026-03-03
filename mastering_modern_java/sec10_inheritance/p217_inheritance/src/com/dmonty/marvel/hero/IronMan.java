/* #############################################################################
 * @Filename        : IronMan.java
 * @Created         : Mon 2026-03-02 18:04:43-0500
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
package com.dmonty.marvel.hero;

import com.dmonty.marvel.base.Person;

public class IronMan extends Person {
  public IronMan() {
    this.name = "Mr IronMan";
  }
  public void usePower() {
    System.out.println(name + " is using his power");
  }
} // IronMan


