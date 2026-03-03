/* #############################################################################
 * @Filename        : Employee.java
 * @Created         : Tue 2026-03-03 07:04:48-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac Employee.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/
package com.dmonty.marvel.hero.impl;

import java.io.Serializable;

public class Employee implements Cloneable, Serializable {
  public void walk() {
    System.out.println("Employee walking.");
  } // walk
} // Employee


