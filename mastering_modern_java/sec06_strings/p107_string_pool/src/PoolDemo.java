/* #############################################################################
 * @Filename        : PoolDemo.java
 * @Created         : Thu 2026-02-26 17:13:43-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac PoolDemo.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class PoolDemo {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    System.out.println("String poop");
    String hello = "hello";
    String h1 = "hello";
    String h2 = "hello2";
    String hey = "hey";

    System.out.println(hello == h1);
    System.out.println(hello == h2);

    System.out.println(hello.hashCode());
    System.out.println(h1.hashCode());
    System.out.println(h2.hashCode());
    System.out.println(hey.hashCode());

    System.out.println("\nString heap");
    String obj1 = new String("hello");
    String obj2 = new String("hello");
    String obj3 = new String("hello");

    System.out.println(obj1.hashCode());
    System.out.println(obj2.hashCode());
    System.out.println(obj3.hashCode());

    System.out.println(obj1 == obj2);
    System.out.println(obj2 == obj3);
    System.out.println(obj2 == obj3);

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  }
} // PoolDemo


