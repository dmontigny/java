/* #############################################################################
 * @Filename        : EmployeeMain.java
 * @Created         : Tue 2026-02-24 06:16:05-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac EmployeeMain.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class EmployeeMain {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    Employee e1 = new Employee();
    Employee e2 = new Employee();
    Employee e3 = new Employee("Leo", "Spoony", (byte)43, 'm');

    e2.set_fName("Dave");
    e2.set_lName("Monty");
    e2.setAge((byte)56);
    e2.setGender('m');

    System.out.println("e1: "
        + e1.get_fName() + " " 
        + e1.get_lName() 
        + " is " 
        + e1.getAge() + " years old.");
    System.out.println("e2: " 
        + e2.get_fName() + " " 
        + e2.get_lName()
        + " is " 
        + e2.getAge() + " years old.");
    System.out.println("e3: " 
        + e3.get_fName() + " " 
        + " is " 
        + e3.getAge() + " years old.");

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  }
} // main


