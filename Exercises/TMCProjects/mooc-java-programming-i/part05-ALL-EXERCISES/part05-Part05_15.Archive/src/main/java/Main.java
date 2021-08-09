/*
Part 1:
The program should read items from the user. When all the items from the user have been read, the program prints the information of each item.
For each item, its identifier and name should be read. If the identifier or name is empty, the program stops asking for input, and prints all the item information.

Part 2:
Modify the program so that after entering the items, each item is printed at most once. Two items should be considered the same if their identifiers are the same (there can be variation in their names in different countries, for instance).
If the user enters the same item multiple times, the print uses the item that was added first.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //create list of "items"
        ArrayList<Item> items = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            Item newItem = new Item(identifier, name);
            if (items.contains(newItem)) {
                System.out.println("Item exists already.");
            } else {
                items.add(newItem);
            }
        }
        System.out.println("==Items==");
        for (Item item : items) {
            System.out.println(item);
        }

    }
}
