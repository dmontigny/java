/* #############################################################################
 * @Filename        : SuperHero.java
 * @Created         : Mon 2026-03-02 20:36:58-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac SuperHero.java
 * @Description     : i
 * https://github.com/eazybytes/java/tree/main/section_11/src/com/eazybytes/marvel/hero
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

  default String trackLiveLocation() {
    String liveLocation = "USA";

    System.out.println("I am in " + liveLocation);

    return liveLocation;
  } // trackLiveLocation;

  static String commonCharacteristics() {
    return "Superhuman abilities. WIllingness to sacrafice.";
  } // commonCharacteristics

  @Override
  default void walk() {
    Person.super.walk();
  } // walk

} // SuperHero


