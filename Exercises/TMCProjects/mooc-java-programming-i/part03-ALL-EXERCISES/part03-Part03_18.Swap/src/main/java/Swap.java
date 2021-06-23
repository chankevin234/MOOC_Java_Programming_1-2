import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        // Implement here
        // asking for the two indices

        System.out.println("Give two indices to swap:");
        int firstIndex = Integer.valueOf(scanner.nextLine());
        int secIndex = Integer.valueOf(scanner.nextLine());
        // and then swapping them
        swap(array, firstIndex, secIndex);


        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

    public static void swap(int[] array, int firstIndex, int secIndex) {
        int helper = array[firstIndex];
        array[firstIndex] = array[secIndex];
        array[secIndex] = helper;
    }

}
