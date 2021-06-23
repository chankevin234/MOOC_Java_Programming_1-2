import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int longestName = 0;
        String longName = "";
        int total = 0;
        int entries = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] array = input.split(",");
            int nameLength = array[0].length();

            if (nameLength > longestName) {
                longName = array[0];
                longestName = nameLength;
            }

            total += Integer.valueOf(array[1]);
            entries++;

        }
        System.out.println("Longest name: " + longName);
        System.out.println("Average of the birth years: " + (double) total / entries);

    }
}
