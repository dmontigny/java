/* #############################################################################
 * @Filename        : ArrayIterate.java
 * @Created         : Tue 2026-03-03 08:13:43-0500
 * @Modified        : Tue 2026-03-03 09:08:34-0500
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

public class ArrayIterate {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    int[] nums = {1, 2, 3, 4, 5};
    String[] names = new String[]{"Dave", "Mendi", "Nate", "Morgan"};
    int[] mobileNums = new int[116];
    double[] prices = new double[1000];
    char[] grades = new char[0];
    int[] emptyArray = {};

    System.out.println(nums.length);
    System.out.println(names.length);
    System.out.println(mobileNums.length);
    System.out.println(grades.length);
    System.out.println(emptyArray.length);

    System.out.println();
    for(int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }

    for(String name: names) {
      System.out.println(name);
    }

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main
} // ArrayLength


