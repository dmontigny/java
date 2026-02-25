/* #############################################################################
 * @Filename        : Car.java
 * @Created         : Tue 2026-02-24 18:32:58-0500
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
  String color;

  {
    System.out.println("Creating car...");
  }

  public Car(){
  }

  {
    this.make = "Toyota";
    this.model = "Camry";
    this.hp = 200;
    this.color = "blue";
  }

  public Car(String make, String model, int hp, String color) {
    this.make = make;
    this.model = model;
    this.hp = hp;
    this.color = color;
    System.out.println("Car created.");
  }

  public void start() {
    System.out.println("Car started");
  } // start

  public String stop() {
    String res = "Car stopped";

    return res;
  } // stop

  public void display() {
    System.out.println(this.make);
    System.out.println(this.model);
    System.out.println(this.hp);
    System.out.println(this.color + '\n');
  } // display
} // Car


