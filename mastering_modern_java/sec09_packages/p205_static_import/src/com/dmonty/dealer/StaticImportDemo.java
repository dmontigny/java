/* #############################################################################
 * @Filename        : StaticImportDemo.java
 * @Created         : Mon 2026-03-02 11:41:53-0500
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
package com.dmonty.dealer;

import com.dmonty.dealer.model.Car;
import com.dmonty.dealer.staff.Employee;
import static com.dmonty.dealer.util.Constant.TAX_RATE;
import static com.dmonty.dealer.util.Constant.SHIPPING;
import static com.dmonty.dealer.util.Constant.calcTotalCost;

public class StaticImportDemo {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    Car c1 = new Car();
    Employee e1 = new Employee();
    double price = 10000;

    System.out.println();
    c1.display();

    System.out.println("List price: " + price);
    System.out.println("Tax rate: " + TAX_RATE);
    System.out.println("Shipping: " + SHIPPING);
    System.out.printf("Total cost: $%.2f\n", calcTotalCost(price));

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main
} // StaticImportDemo


