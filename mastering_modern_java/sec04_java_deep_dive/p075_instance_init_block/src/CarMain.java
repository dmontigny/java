/* #############################################################################
 * @Filename        : CarMain.java
 * @Created         : Tue 2026-02-24 18:30:53-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac Car_main.java
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
    Car c2 = new Car("Ford", "Explorer", 275, "Blue");   

    System.out.println("Car 1:");
    c1.display();
    System.out.println("Car 2:");
    c2.display();

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  }
} // CarMain


