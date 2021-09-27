public class Main {
    public static void main(String[] args) {
        Menu exactum = new Menu();

        // Part 1: addMeal(String meal)
        exactum.addMeal("Smoked salmon, white wine and butter sauce with basil");
        exactum.addMeal("Seasonal green salad with apple-honey vinegarette");
        exactum.addMeal("Roasted lamb in a red wine sauce");
        exactum.addMeal("Roasted lamb in a red wine sauce");

        // Part 2: printMeals()

        exactum.printMeals();

        // When you have completed the method clearMenu()
        exactum.clearMenu();
        exactum.printMeals();
    }
}
