
import java.util.Locale;
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container container1 = new Container();
        Container container2 = new Container();

        while (true) {
            System.out.print("> ");

            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);

            String input = scan.nextLine();

            if (input.equals("quit")) {
                System.out.println("Exiting...");
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                container1.add(amount);
            }
            else if (command.equals("remove")) {
                container2.remove(amount);
            }
            else if (command.equals("move")) {
                // if its negative or the value to move is return and do nothing
                if (amount <= 0 || container1.contains() == 0) {
                    return;
                }
                // if it ends up being a negative valule when moving says trying to move 40 from 30
                // just move the total value of firstcontainer
                if (container1.contains() - amount < 0) {
                    amount = container1.contains();
                }
                container1.remove(amount);
                container2.add(amount);
            }
            else {
                System.out.println("Invalid Input");
            }

        }
    }

}
