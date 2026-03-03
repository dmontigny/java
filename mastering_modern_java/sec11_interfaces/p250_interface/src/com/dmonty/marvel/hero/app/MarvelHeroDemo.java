/* #############################################################################
 * @Filename        : MarvelHeroDemo.java
 * @Created         : Tue 2026-03-03 04:46:35-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac MarvelHeroDemo.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/
package com.dmonty.marvel.hero.app;

import com.dmonty.marvel.hero.SuperHero;
import com.dmonty.marvel.hero.impl.*;

public class MarvelHeroDemo {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  
    
    IronMan ironMan = new IronMan();
    SpiderMan spiderMan = new SpiderMan();
    CaptainAmerica captainAmerica = new CaptainAmerica();
    Developer developer = new Developer();

    System.out.println(SuperHero.UNIVERSE_NAME);

    invokeSuperHero(ironMan);
    invokeSuperHero(spiderMan);
    invokeSuperHero(captainAmerica);

    developer.walk();

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main

  private static void invokeSuperHero(SuperHero superHero) {
    System.out.println(superHero.usePower());
    System.out.println(superHero.stopVillain('n'));
  } // invokeSuperHero
} // MarvelHeroDemo


