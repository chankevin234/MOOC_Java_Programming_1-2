import java.util.ArrayList;

public class RecipeBook {

    private ArrayList<Recipe> recipes;

    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public void printRecipes() {
        for(Recipe recipe : this.recipes) {
            System.out.println(recipe);
        }
    }

    public void findName(String searchString) { //returns all recipes which contain this searchSTring
        for (Recipe recipe : this.recipes) {
            if (recipe.getName().contains(searchString)) {
                System.out.println(recipe);
            }
        }
    }

    public void findTime(int searchTime) {
        for (Recipe recipe : this.recipes) {
            if (recipe.getTime() <= searchTime) {
                System.out.println(recipe);
            }
        }
    }

    public void findIngredient(String searchIngredient) {
        for (Recipe recipe : this.recipes) {
            if (recipe.getIngredients().contains(searchIngredient)) {
                System.out.println(recipe);
            }
//            else {
//                System.out.println("None");
//            }
        }
    }


}
