
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //initalize userinput
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.

        Gradebook gradebook = new Gradebook(); //initialize gradebook class
        userInterface myInterface = new userInterface(gradebook, scanner); //give it to the user interface
        myInterface.start();

    }
}
