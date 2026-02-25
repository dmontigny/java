/* #############################################################################
 * @Filename        : MethodInvocation.java
 * @Created         : Wed 2026-02-25 06:51:41-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac MethodInvocation.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class MethodInvocation {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    MethodInvocation demoObj = new MethodInvocation();

    demoObj.method1();

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main

  public void method1() {
    int num = 10;

    System.out.println("Method " + num / 10);
    String out2 = method2();
    System.out.println(out2);
  }

  public String method2() {
    String output = "Hello World";
    int num = 20;

    System.out.println("Method " + num / 10);
    method3("Hi");

    return output;
  }

  public void method3(String input) {
    int num = 30;

    System.out.println("Method " + num / 10);
    System.out.println(input);
    method4(10);
  }

  public void method4(int n) {
    int num = 40;

    System.out.println("Method " + num / 10);
    System.out.println(n);
  }
} // MethodInvocation



