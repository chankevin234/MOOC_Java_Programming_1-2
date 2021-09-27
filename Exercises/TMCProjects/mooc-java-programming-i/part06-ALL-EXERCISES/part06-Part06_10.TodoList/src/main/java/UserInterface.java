import java.util.Scanner;

public class UserInterface {

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                add();
            } else if (command.equals("list")) {
                list();
            } else if (command.equals("remove")) {
                remove();
            } else {
                System.out.println("Unknown command");
            }
        }
    }

    public void add() {
        //asks the user for the next task to be added. Once the user enters this task, it should be added to the to-do list.
        System.out.print("To add: ");
        String task = this.scanner.nextLine();
        this.todoList.add(task);
    }

    public void list() {
        //prints out all the tasks on the to-do list
        this.todoList.print();
    }

    public void remove() {
        // asks the user to enter the id of the task to be removed.
        // When this has been entered, the specified task should be removed from the list of tasks.
        if (this.todoList.size() == 0) {
            System.out.println("There is nothing to remove");
            return;
        }
        System.out.print("Which one is removed? ");
        int taskID = Integer.valueOf(scanner.nextLine());
        this.todoList.remove(taskID);
    }
}
