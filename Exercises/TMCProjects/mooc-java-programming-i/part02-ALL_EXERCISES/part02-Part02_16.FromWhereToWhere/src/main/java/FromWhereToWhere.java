import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here (Part 1)
//        int input = Integer.valueOf(scanner.nextLine());
//        for (int i = 1; i < input + 1; i++) {
//            System.out.println(i);
//        }

        //Part 2
//        System.out.println("Where to?");
//        int to = Integer.valueOf(scanner.nextLine());
//        System.out.println("Where from?");
//        int from = Integer.valueOf(scanner.nextLine());
//
//        if (from < to) {
//            for (int y = from; y < to + 1; y++) {
//                System.out.println(y);
//            }
//        }

        //combo breaker!
        System.out.println("Where to?");
        int toInput = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int fromInput = Integer.valueOf(scanner.nextLine());

        while (fromInput <= toInput) {
            System.out.println(fromInput);
            fromInput += 1;
        }
    }
}
