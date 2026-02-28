/* #############################################################################
 * @Filename        : CookingRecipe.java
 * @Created         : Fri 2026-02-27 05:55:05-0500
 * @Modified        :
 * @Args            : 
 * @Author          : David L. Montigny
 * @Email           : dmontigny27@gmail.com
 * @Usage           : javac CookingRecipe.java
 * @Description     : 
 * ###########################################################################*/

/* ============================= include files ===============================*/


/* ================================ macros ===================================*/


/* ============================ global variables =============================*/


/* =============================== prototypes ================================*/


/* ===========================================================================*/

/**
 * You have a String variable with the name recipe. Inside it's value, replace
 *  pepper with cinnamon and print the updated String value on to the console.
 */
public class CookingRecipe {
  public static void main(String[] args) {
    System.out.println("\nProgram starting\n");  

    String recipe = "Add salt and pepper to taste.";

    System.out.println(recipe.replace("pepper", "cinnamon"));

    System.out.println("\nProgram ending\n");  
    System.exit(0);
  }
} // CookingRecipe


