
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {

                if (amount <= 0) {
                    continue;
                }

                if ((firstContainer + amount) > 100) {
                    firstContainer = 100;
                } else {
                    firstContainer += amount;
                }
                System.out.println("First: " + firstContainer + "/100");
                System.out.println("Second: " + secondContainer + "/100");
            } else if (command.equals("move")) {

                if (amount <= 0 || firstContainer == 0) {
                    continue;
                }

                if (amount >= 100) {
                    firstContainer = 0;
                    secondContainer = 100;
                } else if (secondContainer + amount <= 100) {
                    secondContainer += amount;
                    firstContainer -= amount;
                } else {
                    secondContainer = 100;
                    firstContainer = 0;
                }

                } else if (command.equals("remove")) {
                    if (amount <= 0) {
                        return;
                    }
                    if (amount > secondContainer) {
                        secondContainer = 0;
                    } else {
                        secondContainer -= amount;
                    }
                } else {
                    System.out.println("Unknown command");
                }

            }
        }
    }
}