import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String strings = scanner.nextLine();

        while (!strings.equals("")) {
            String[] stringArray = strings.split(" ");
            for (int i = 0; i < stringArray.length; i++) {
                System.out.println(stringArray[i]);
            }

            strings = scanner.nextLine();
        }

    }
}
