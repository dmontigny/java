/* #############################################################################
 * @Filename        : MathOps.java
 * @Created         : Wed 2026-02-25 04:33:29-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac MathOps.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class MathOps {
  double pi = 3.14;
  static final double PI = 3.14;

  public static void oldMain(String[] args) {
    MathOps mathOps = new MathOps();
    double res1 = mathOps.add(10, mathOps.pi);
    double res2 = addStat(20, PI);
    double res3 = addStat(20, PI);

    System.out.println("add res: " + res1);
    System.out.println("addStat res: " + res2);
  }

  public double add(int n1, double n2) {
    return n1 + n2;
  }
  
  public static double addStat(int n1, double n2) {
    return n1 + n2;
  }
} // main


