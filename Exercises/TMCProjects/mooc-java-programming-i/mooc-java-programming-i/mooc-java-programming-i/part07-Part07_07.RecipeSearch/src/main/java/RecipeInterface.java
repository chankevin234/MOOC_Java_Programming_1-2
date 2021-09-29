import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RecipeInterface { //logic for interface

    private Scanner scanner;
    private RecipeBook recipeBook;
    private ArrayList<String> ingredients;

    public RecipeInterface(Scanner scanner, RecipeBook cookBook) {
        this.scanner = scanner;
        this.recipeBook = cookBook;
        this.ingredients = new ArrayList<>();
    }

    public void start() {
        System.out.println("Commands:\n" +
                "list - lists the recipes\n" +
                "stop - stops the program\n" +
                "find name- searches recipes by name\n" +
                "find cooking time - searches recipes by cooking time\n"+
                "find ingredient - searches recipes by ingredient");

        System.out.println("Enter command");

        while (true) {
            String command = this.scanner.nextLine();

            if (command.equals("list")) {
                System.out.println("Recipes:");
                this.recipeBook.printRecipes();
            }
            else if (command.equals("find name")){
                System.out.println("Searched word");
                String searchString = this.scanner.nextLine();

                System.out.println("Recipes:");
                this.recipeBook.findName(searchString);
            }
            else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int searchTime = Integer.valueOf(this.scanner.nextLine());

                System.out.println("Recipes:");
                this.recipeBook.findTime(searchTime);
            }
            else if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String searchIngredient = this.scanner.nextLine();

                System.out.println("Recipes:");
                this.recipeBook.findIngredient(searchIngredient);
            }

            else if (command.equals("stop")) {
                System.out.println("Exiting...");
                break;
            }
            else {
                System.out.println("Invalid command");
            }
        }
    }
}
