/* #############################################################################
 * @Filename        : UpcastingDemo.java
 * @Created         : Mon 2026-03-02 19:35:52-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac UpcastingDemo.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/
package com.dmonty.zoo.app;

import com.dmonty.zoo.animals.Dog;
import com.dmonty.zoo.animals.Cat;
import com.dmonty.zoo.base.Animal;
import com.dmonty.zoo.app.AnimalUtil;

public class UpcastingDemo {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");

    Animal a1 = new Animal();

    a1.setName("Scooby");
    AnimalUtil.printName(a1);
    System.out.println(a1.getName());
    a1.eat();

    Animal a2 = new Dog();

    a2.setName("Charlie");
    System.out.println(a2.getName());
    a2.eat();

    Cat c1 = new Cat();

    c1.setName("Garfield");
    AnimalUtil.printName(c1);
    c1.eat();

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main
} // UpcastingDemo


