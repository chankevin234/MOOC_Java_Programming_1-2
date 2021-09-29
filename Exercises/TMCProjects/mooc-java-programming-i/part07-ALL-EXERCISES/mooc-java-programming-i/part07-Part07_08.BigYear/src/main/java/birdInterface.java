import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Scanner;

public class birdInterface {

    private Scanner scanner;
    private BirdCage birdCage;

    public birdInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birdCage = new BirdCage();
    }

    public void start() {


        System.out.println("Welcome to the Bird Cage\n" +
                    "Commands:\n" +
                    "Add - adds a bird\n" +
                    "Observation - adds an observation\n" +
                    "All - prints all birds\n" +
                    "One - prints one bird\n" +
                    "Quit - ends the program");
        while (true) {
            String command = scanner.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();

                Bird newBird = new Bird(name, latinName);
                birdCage.addBird(newBird);

            }
            else if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String birdName = scanner.nextLine();

                birdCage.addObservation(birdName);
            }
            else if (command.equals("All")) {
                birdCage.printAll();
            }
            else if (command.equals("One")) {
                System.out.print("Bird? ");
                String birdName = scanner.nextLine();

                birdCage.printOne(birdName);
            }
            else {
                System.out.println("Invalid command");
            }
        }

    };

}
