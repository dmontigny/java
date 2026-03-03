/* #############################################################################
 * @Filename        : ArrayLength.java
 * @Created         : Tue 2026-03-03 08:13:43-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac ArrayLength.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/
package com.dmonty.main;

public class ArrayLength {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    int[] nums = {1, 2, 3, 4, 5};
    String[] names = new String[]{"Dave", "Mendi", "Nate", "Morgan"};
    int[] mobileNums = new int[116];

    System.out.println(nums.length);
    System.out.println(names.length);
    System.out.println(mobileNums.length);

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main
} // ArrayLength


