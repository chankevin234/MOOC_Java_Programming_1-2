import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());

        // Implement the search functionality here
        search(array, searching);
    }

    public static void search(int[] array, int searchValue) {
        int index = 0;
        for (int value : array) {
            //System.out.println(index);
            if (value == searchValue) {
                System.out.println(searchValue + " is at index " + index + ".");
                return;
            }
            index++;
        }
        System.out.println(searchValue + " was not found.");
    }


}


