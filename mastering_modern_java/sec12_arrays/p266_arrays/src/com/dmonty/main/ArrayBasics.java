/* #############################################################################
 * @Filename        : ArrayBasics.java
 * @Created         : Tue 2026-03-03 07:32:31-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac ArrayBasics.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/
package com.dmonty.main;

import com.dmonty.model.Person;

public class ArrayBasics {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    int mobile1, mobile2, mobile3;
    int[] mobileNums = new int[5];
    int[] nums = {1, 2, 3, 4, 5};
    double[] prices;
    char[] grades;
    String[] names;

    int length = 100;
    Person[] presons = new Person[length];

    mobileNums[0] = 066554433;
    mobileNums[1] = 166554433;
    mobileNums[2] = 266554433;
    mobileNums[3] = 366554433;
    mobileNums[4] = 466554433;

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main
} // ArrayBasics


