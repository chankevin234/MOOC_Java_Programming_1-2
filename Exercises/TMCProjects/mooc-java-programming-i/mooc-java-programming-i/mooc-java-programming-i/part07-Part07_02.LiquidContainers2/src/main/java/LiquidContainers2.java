
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            System.out.print("> ");

            String input = scan.nextLine();
            String[] parts = input.split(" ");

            if (input.equals("quit")) {
                break;
            }

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                firstContainer.add(amount);
            } else if (command.equals("move")) {

                // if its negative or the value to move is return and do nothing
                if (amount <= 0 || firstContainer.contains() == 0) {
                    return;
                }
                // if it ends up being a negative valule when moving says trying to move 40 from 30
                // just move the total value of firstcontainer
                if (firstContainer.contains() - amount < 0) {
                    amount = firstContainer.contains();
                }

                firstContainer.remove(amount);
                secondContainer.add(amount);

            } else if (command.equals("remove")) {
                secondContainer.remove(amount);
            } else {
                System.out.println("Unknown command");
            }


        }
    }

}
