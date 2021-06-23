import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInputs = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                if (numInputs == 0) {
                    System.out.println("Cannot calculate the average");
                }
                break;
            }
            if (number > 0) {
                numInputs++;
                sum = sum + number;
            }
        }
        double average = (double) sum / numInputs;
//        System.out.println("Number of numbers: " + numInputs);
//        System.out.println("Sum of the numbers: " + sum);
        System.out.println(average);
    }
}
