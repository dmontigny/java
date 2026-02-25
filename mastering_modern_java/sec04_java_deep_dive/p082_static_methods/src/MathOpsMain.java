/* #############################################################################
 * @Filename        : MathOpsMain.java
 * @Created         : Wed 2026-02-25 05:32:25-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac MathOpsMain.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class MathOpsMain {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    MathOps mathOps = new MathOps();
    double res1 = MathOps.addStat(30, MathOps.PI);
    double res2 = mathOps.add(40, mathOps.pi);

    System.out.println("res1: " + res1);
    System.out.println("res2: " + res2);

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  }
} // MathOpsMain


