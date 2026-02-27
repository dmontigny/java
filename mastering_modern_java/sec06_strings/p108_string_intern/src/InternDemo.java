/* #############################################################################
 * @Filename        : InternDemo.java
 * @Created         : Thu 2026-02-26 18:10:35-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac InternDemo.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class InternDemo {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    String hello = "Hello";
    String obj = new String("Hello").intern();

    System.out.println(hello == obj);

    System.out.println("\nPart 2");
    String s1 = "hello";
    String s2 = new String("hello");
    System.out.println("s1 == s2: " + (s1 == s2));
    String s3 = s2.intern();
    System.out.println("s1 == s3: " + (s1 == s3));
    System.out.println("s2 == s3: " + (s2 == s3));

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  }
} // InternDemo


