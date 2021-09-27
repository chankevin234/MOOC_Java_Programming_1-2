import java.util.Scanner;

public class TextUI {
    private Scanner scanner; //scanner-type variable
    private SimpleDictionary dictionary; //simpleDict-type variable

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        // ask for user command

        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                //If the command is end, the UI prints the string "Bye bye!" and the execution of the start method ends.
                System.out.println("Bye bye!");
                break;

            } else if (command.equals("add")) {
                //If the command is add, the text UI asks the user for a word and a translation, each on its own line. After this the words are stored in the dictionary, and the method continues by asking for a new command (loops back to stage 1).
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();

                this.dictionary.add(word, translation);
            } else if (command.equals("search")) {
                //If the command is search, the text UI asks the user for the word to be translated. After this it prints the translation of the word, and the method continues by asking for a new command (loops back to stage 1).
                System.out.println("To be translated");
                String input = scanner.nextLine();

                if (this.dictionary.translate(input) == null) {
                    System.out.println("Word " + input + " was not found");
                } else {
                    System.out.println("Translation: " + this.dictionary.translate(input));
                }
                
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
