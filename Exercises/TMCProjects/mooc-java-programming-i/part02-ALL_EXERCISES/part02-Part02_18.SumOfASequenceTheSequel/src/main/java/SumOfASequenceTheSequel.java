import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int firstInput = Integer.valueOf(scanner.nextLine());

        System.out.println("Last number?");
        int lastInput = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        while (firstInput <= lastInput) {
            sum += firstInput;
            firstInput += 1;
        }
        System.out.println("The sum is: " + sum);
    }
}
