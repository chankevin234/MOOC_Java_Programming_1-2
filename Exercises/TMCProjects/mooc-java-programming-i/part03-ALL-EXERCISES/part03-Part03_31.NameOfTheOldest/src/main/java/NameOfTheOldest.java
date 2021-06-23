import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String oldName = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] array = input.split(",");
            int age = Integer.valueOf(array[1]);
            System.out.println(array[0]);

            if (age > oldest) {
                oldest = age;
                oldName = array[0];
            }

        }
        System.out.println("Age of the oldest: " + oldName);

    }
}
