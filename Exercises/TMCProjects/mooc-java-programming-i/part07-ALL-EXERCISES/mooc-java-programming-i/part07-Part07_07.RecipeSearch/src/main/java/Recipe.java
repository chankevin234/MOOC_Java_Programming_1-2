import java.util.ArrayList;

public class Recipe { //individual recipes
    /*
     * Each recipe consists of three or more rows in a recipe file.
     * The first row is for the name of the recipe,
     * the second the cooking time (an integer),
     * the third and possibly following rows list the ingredients used in the recipe.
     */

    private String name;
    private int time;
    private ArrayList<String> ingredients;

    public Recipe(String name, int time, ArrayList<String> ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }

    public String getName() {
        return this.name;
    }

    public int getTime() {
        return this.time;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.time;
    }
}
