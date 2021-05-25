import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // Write your program here
        double average = 0;
        int numbers = 3;
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int third = Integer.valueOf(scanner.nextLine());
        int sum = first + second + third;
        average = (double) sum / numbers;

//      System.out.println(first + " * " + second + " = " + sum);
        System.out.println("The average is " + average);

    }
}
