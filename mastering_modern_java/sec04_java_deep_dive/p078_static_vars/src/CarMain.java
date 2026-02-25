/* #############################################################################
 * @Filename        : CarMain.java
 * @Created         : Tue 2026-02-24 19:12:38-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac CarMain.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class CarMain {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    Car c1 = new Car();   
    c1.display();

    Car c2 = new Car("Ford", "Explorer", 275, "Blue");   
    c2.display();

    System.out.println("Number of cars: " + Car.nCars);

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  }
} // CarMain


