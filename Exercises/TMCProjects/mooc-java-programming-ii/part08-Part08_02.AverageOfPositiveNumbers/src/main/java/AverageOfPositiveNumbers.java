
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int counter = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) { // checks for 0 to exit
                if (total == 0) { //checks total
                    System.out.println("Cannot calculate the average");
                    break;
                }
                System.out.println((double)total/counter);
                break;
            }

            if (input > 0) {
                counter += 1;
                total += input;
            }
        }
    }
}
