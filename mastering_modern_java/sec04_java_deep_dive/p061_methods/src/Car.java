/* #############################################################################
 * @Filename        : Car.java
 * @Created         : Tue 2026-02-24 05:45:55-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac Car.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class Car {
  String make;
  String model;
  int hp;

  public void start() {
    System.out.println("Car started");
  }

  public int stop() {
    String res = "Car stopped";

    return res;
  }
} // main


