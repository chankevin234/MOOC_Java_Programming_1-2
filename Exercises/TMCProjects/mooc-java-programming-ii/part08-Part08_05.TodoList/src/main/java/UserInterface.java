import java.util.Scanner;

public class UserInterface {
    private TodoList todolist;
    private Scanner scanner;

    public UserInterface(TodoList todolist, Scanner scanner) {
        this.todolist = todolist; //initiates a new todolist
        this.scanner = scanner; //will be passed in from main
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");

            String input = scanner.nextLine().toLowerCase();

            if (input.equals("stop")) {
                System.out.println("Exiting...");
                break;
            }
            else if (input.equals("add")) {
                System.out.print("To add: ");
                String newTask = scanner.nextLine();
                todolist.add(newTask);
            }
            else if (input.equals("list")) {
                todolist.print();
            }
            else if (input.equals("remove")) {
                System.out.print("Which one is removed? ");
                int taskPosition = Integer.valueOf(scanner.nextLine());
                todolist.remove(taskPosition);
            }
            else {
                System.out.println("Invalid command");
            }
        }
    }
}
