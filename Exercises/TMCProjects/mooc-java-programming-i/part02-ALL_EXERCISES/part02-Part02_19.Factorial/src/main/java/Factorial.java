import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int firstInput = Integer.valueOf(scanner.nextLine());

        int sum = 1;
        int count = 1;
        while (count <= firstInput) {
            sum = sum * count;
            count += 1;
        }
        System.out.println("Factorial: " + sum);
    }
}
