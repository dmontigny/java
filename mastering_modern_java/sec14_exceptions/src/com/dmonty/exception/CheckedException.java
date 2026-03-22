/* #############################################################################
 * @Filename        : CheckedException.java
 * @Created         : Sun 2026-03-22 07:28:25-0400
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac CheckedException.java
 * @Description     : 
 * ###########################################################################*/

/* ============================== import files ===============================*/
import java.io.FileReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

public class CheckedException {
  public static void main(String[] args) throws IOException {
    System.out.println("\nProgram starting\n");  

    try (InputStreamReader isr = new InputStreamReader(System.in);
         BufferedReader bf = new BufferedReader(isr);) {

      System.out.print("Please enter a value: ");
      String input = bf.readLine();
      System.out.println("Value entered: " + input);
    } catch(IOException ex) {
      ex.printStackTrace();
    }

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main

  public void readFile() throws FileNotFoundException {
    try {
      FileReader fr = new FileReader("com/dmonty/files/forest.txt");
    } catch(FileNotFoundException ex) {
      ex.printStackTrace();
    }
  } // readFile

} // CheckedException

