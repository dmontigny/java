/* #############################################################################
 * @Filename        : MarvelMain.java
 * @Created         : Mon 2026-03-02 18:15:10-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac MarvelMain.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/
package com.dmonty.marvel.app;

import com.dmonty.marvel.base.Person;
import com.dmonty.marvel.hero.IronMan;

public class MarvelMain {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    IronMan ironMan = new IronMan();
    Person p1 = new Person();

    int hc = p1.hashCode();
    String str = p1.toString();

    ironMan.walk();
    ironMan.eat("Pasta");
    ironMan.sleep();
    ironMan.usePower();


    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main
} // MarvelMain


