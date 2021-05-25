import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int sum = 0;
        int subtract = 0;
        int multi = 0;
        double quotient = 0;
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        sum = first + second;
        subtract = first - second;
        multi = first * second;
        quotient = (double) first / second;

        System.out.println(first + " + " + second + " = " + sum);
        System.out.println(first + " - " + second + " = " + subtract);
        System.out.println(first + " * " + second + " = " + multi);
        System.out.println(first + " / " + second + " = " + quotient);

    }
}
