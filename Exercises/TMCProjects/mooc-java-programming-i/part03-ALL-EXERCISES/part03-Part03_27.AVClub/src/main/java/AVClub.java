import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String strings = scanner.nextLine();
            if (strings.equals("")) {
                break;
            }
            String[] sArray = strings.split(" ");

            for (String value : sArray) {
                if (value.contains("av")) {
                    System.out.println(value);
                }
            }
        }


    }
}
