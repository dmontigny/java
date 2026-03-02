package com.dmonty.dealer.model;
/* #############################################################################
 * @Filename        : Car.java
 * @Created         : Wed 2026-02-25 04:20:45-0500
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
  private String make;
  private String model;
  private int hp;
  private String color;
  static short nCars;
  private short sn;

  {
    System.out.println("Creating car...");
  }

  static {
    System.out.println("Car static init...");
    nCars = 100;
  }

  public Car() {
  }

  {
    this.make = "Toyota";
    this.model = "Camry";
    this.hp = 200;
    this.color = "blue";
    this.nCars++;
    this.sn = nCars;
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

  void setMake(String make) {
    this.make = make;
  } // setNaje

  void setModel(String model) {
    this.model = model;
  } // setModel

  void setHP(int hp) {
    this.hp = hp;
  } // setHP

  void setColor(String color) {
    this.color = color;
  } // setColor

  String getMake() {
    return this.make;
  } // getMake

  String getModel() {
    return this.model;
  } // getModel

  int getHP() {
    return this.hp;
  } // getHP

  String getColor() {
    return this.color;
  }

  public short getSN() {
    return this.sn;
  }

  public void display() {
    System.out.println("Car number: " + this.sn);
    System.out.println(this.make);
    System.out.println(this.model);
    System.out.println(this.hp);
    System.out.println(this.color + '\n');
  } // display
} // Car


