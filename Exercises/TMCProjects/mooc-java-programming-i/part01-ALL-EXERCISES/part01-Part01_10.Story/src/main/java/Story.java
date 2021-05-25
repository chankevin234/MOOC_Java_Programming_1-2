import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String ans1 = scanner.nextLine();
        System.out.println("What is their job?");
        String ans2 = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + ans1 + ", who was " + ans2 + ".");
        System.out.println("On the way to work, " + ans1 + " reflected on life.");
        System.out.println("Perhaps " + ans1 + " will not be " + ans2 + " forever.");
    }
}
