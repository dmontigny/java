package com.dmonty.dealer;
/* #############################################################################
 * @Filename        : ImportDemo.java
 * @Created         : Sun 2026-03-01 09:05:59-0500
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

import com.dmonty.dealer.model.Car;
import com.dmonty.dealer.staff.Employee;

public class ImportDemo {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    Car c1 = new Car();
    Employee e1 = new Employee();

    System.out.println();
    c1.display();

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main
} // ImportDemo


