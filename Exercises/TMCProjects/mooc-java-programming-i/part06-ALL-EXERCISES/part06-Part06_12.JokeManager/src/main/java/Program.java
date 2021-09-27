import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        JokeManager jokeManager = new JokeManager();

        UserInterface newInterface = new UserInterface(jokeManager, scanner);
        newInterface.start();
        
    }
}
