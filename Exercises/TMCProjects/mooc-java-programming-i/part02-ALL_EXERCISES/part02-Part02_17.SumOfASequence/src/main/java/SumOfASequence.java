import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.valueOf(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i < input + 1; i++) {
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);
    }
}
