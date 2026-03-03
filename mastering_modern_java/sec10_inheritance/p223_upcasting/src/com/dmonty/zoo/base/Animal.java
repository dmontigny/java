/* #############################################################################
 * @Filename        : Animal.java
 * @Created         : Mon 2026-03-02 19:10:44-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac Animal.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/
package com.dmonty.zoo.base;

public class Animal {
  private String name;

  public void setName(String name) {
    this.name = name;
  } // setName

  public String getName() {
    return name;
  } // getName

  public void eat() {
    System.out.println(name + " is eating");
  } // eat
} // Animal


