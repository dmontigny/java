/* #############################################################################
 * @Filename        : IsPalindrome.java
 * @Created         : Fri 2026-02-27 19:22:37-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac IsPalindrome.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

/* Write down a Java program to identify if the given String is a
 *  palindrome or not
 */
public class IsPalindrome {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    String s1 = new String("tomcat");
    String s2 = new String("anna");
    String res1, res2;

    if(PalindromeTest(s1)) {
      res1 = "";
    } else {
      res1 = "not ";
    }

    if(PalindromeTest(s2)) {
      res2 = "";
    } else {
      res2 = "not ";
    }

    System.out.println(s1 + " is " + res1 + "a palindrome");
    System.out.println(s2 + " is " + res2 + "a palindrome");

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main

  static boolean PalindromeTest(String s) {
    String tmp = new StringBuilder(s).reverse().toString();

    return s.equals(tmp);
  }
} // IsPalindrome


