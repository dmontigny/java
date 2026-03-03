/* #############################################################################
 * @Filename        : FileReaderDemo.java
 * @Created         : Tue 2026-03-03 14:01:03-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac FileReader.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/
package com.dmonty.input;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderDemo {
  public static void main(String[] args) throws FileNotFoundException, IOException {
    System.out.println("\nProgram starting\n");  

    FileReader fr = new FileReader("com/dmonty/input/forest.txt");
    BufferedReader bf = new BufferedReader(fr);
    String line;

    while ((line = bf.readLine()) != null) {
      System.out.println(line);
    }
    bf.close();

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  } // main
} // FileReader


