import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999

        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<Integer> indicesOfSmallest = new ArrayList<>();
        int answer = Integer.valueOf(scanner.nextLine());
        int smallest = answer;
        int index = 0;

        while (answer != 9999) {
            if (answer <= smallest) {
                smallest = answer;
                indicesOfSmallest.add(index);
            }
            numList.add(answer);
            answer = Integer.valueOf(scanner.nextLine());
            index++;
        }
        System.out.println(numList);
        System.out.println(indicesOfSmallest);
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i < indicesOfSmallest.size(); i++) {
            System.out.println("Found at index: " + indicesOfSmallest.get(i));
        }

    }
}
