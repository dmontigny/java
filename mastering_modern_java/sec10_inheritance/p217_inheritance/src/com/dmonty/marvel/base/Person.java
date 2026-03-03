/* #############################################################################
 * @Filename        : Person.java
 * @Created         : Mon 2026-03-02 17:56:07-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac Person.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/
package com.dmonty.marvel.base;

public class Person {
  protected String name;
  protected int age;

  public void eat(String food) {
    System.out.println(name + " is eating " + food);
  } // eat

  public void walk() {
    System.out.println(name + " is walking.");
  }

  public void sleep() {
    System.out.println(name + " is sleeping.");
  }
} // Person


