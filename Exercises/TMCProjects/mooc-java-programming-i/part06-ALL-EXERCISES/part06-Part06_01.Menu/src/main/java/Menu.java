import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals; //initializes a new arraylist

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal) {
        if (meals.contains(meal)) {
            System.out.println("This meal already exists in the list");
        } else {
            this.meals.add(meal);
        }
    }

    public void printMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu() {
        this.meals.clear();
    }

}
