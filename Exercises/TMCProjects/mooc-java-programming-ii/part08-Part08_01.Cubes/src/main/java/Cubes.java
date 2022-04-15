
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intValue;
        int cubed;

        while (true) {
            System.out.println("Please enter an Integer (end to exit)");
            String value = scanner.nextLine();
            if (value.equals("end")) {
                break;
            }

            intValue = Integer.valueOf(value);
            cubed = intValue*intValue*intValue;

            System.out.println(cubed);
        }

    }
}