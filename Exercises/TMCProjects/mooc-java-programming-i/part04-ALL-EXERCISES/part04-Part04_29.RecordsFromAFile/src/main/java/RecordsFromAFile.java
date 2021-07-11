import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String input = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(input))) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();

                if (row.isEmpty()) {
                    continue;
                }

                String[] parts = row.split(","); //array contains two separate parts of the split string
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                System.out.println(name + ", age: " + age + " years");
            }


        } catch (Exception e) {
            System.out.println("Error: " + e);
        }


    }
}
