/* #############################################################################
 * @Filename        : SubtractMatrix.java
 * @Created         : Tue 2026-03-03 09:44:12-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac SubtractMatrix.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class SubtractMatrix {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    subtractionMatrices(); 

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main

  /**
   * You have a static method  subtractionMatrices which accepts no input
   *  parameters and returns a 2D array of type int. Inside this method you
   *  have a couple of 2D arrays with the name array1 and array2.  Write logic
   *  inside the method to subtract the two arrays and the result should be
   *  copied to a new 2D array. At the end return the new 2D array.
   *
   *  Expected Output:
   *   {-6, 5, -5},
   *   {-2, 5, 8}
   */
  public static int[][] subtractionMatrices() {
    int[][] array1 = {
      {3,6,2}, {4,9,8}
    };
    
    int[][] array2 = {
      {9,1,7}, {6,4,0}
    };

    // Write your code below
    int[][] res = array1;

    for(int r = 0; r < res.length; r++) {
      for(int c = 0; c < res[r].length; c++) {
        res[r][c] -= array2[r][c];
      }
    }

    return res;
  } // subtractionMatrices
} // SubtractMatrix


