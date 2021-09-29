
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RecipeSearch { //MAIN

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeBook cookBook = new RecipeBook();

        RecipeInterface recipeInterface = new RecipeInterface(scanner, cookBook);

        /*
         * Starts the file collection and sorting into recipes
         * */

        System.out.println("File to read: ");
        String fileName = scanner.nextLine();

        //take in file
        try (Scanner fileScanner = new Scanner((Paths.get(fileName)))) {
            while (fileScanner.hasNextLine()) {

                String name = fileScanner.nextLine(); //take in name
                int time = Integer.valueOf(fileScanner.nextLine()); //take in time

                ArrayList<String> ingredients = new ArrayList<>(); // stores entire recipes in 1 line

                while (fileScanner.hasNextLine()) { //while there are are lines...
                    String ingredient = fileScanner.nextLine(); //collect ingredients into the arraylist
                    if (ingredient.isEmpty()) {
                        break; //if the next line collects nothing, leave this while loop
                    }
                    ingredients.add(ingredient); //otherwise, keep collecting
                }
//                System.out.println(ingredients);

                Recipe newRecipe = new Recipe(name, time, ingredients);
                cookBook.addRecipe(newRecipe);
//                if (name.isEmpty()) { //keep going until there are no more lines
//                    continue;
//                }
            }
            System.out.println("Added new recipes...");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        /*
        * Starts the user interface
        * */
        recipeInterface.start();
    }

}
