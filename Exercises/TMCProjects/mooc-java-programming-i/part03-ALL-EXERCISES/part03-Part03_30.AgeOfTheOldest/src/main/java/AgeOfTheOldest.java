import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] array = input.split(",");
            int comparator = Integer.valueOf(array[1]);
            if (comparator > oldest) {
                oldest = comparator;
            }

        }
        System.out.println("Age of the oldest: " + oldest);

    }
}
