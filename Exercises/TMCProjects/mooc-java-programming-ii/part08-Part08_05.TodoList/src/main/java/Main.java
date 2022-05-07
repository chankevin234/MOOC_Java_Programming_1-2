import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();
        UserInterface myInterface = new UserInterface(todoList, scanner); //this initializes the userinterface and gives it the scanner

        myInterface.start(); //runs the userinterface
    }
}
