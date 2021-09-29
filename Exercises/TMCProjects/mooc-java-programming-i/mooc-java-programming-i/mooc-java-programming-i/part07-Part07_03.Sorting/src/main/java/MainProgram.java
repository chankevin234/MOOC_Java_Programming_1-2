import java.util.Arrays;

public class MainProgram {

    public static int smallest(int[] intArray) {
        if (intArray.length == 0) {
            return 0;
        }

        int smallest = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < smallest) {
                smallest = intArray[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] intArray) {
//        if (intArray.length == 0) {
//            return 0;
//        }
        int smallestIndex = 0;
        int smallest = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < smallest) {
                smallest = intArray[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex)  {
        int smallestIndex = startIndex;

        int smallest = table[startIndex];
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int tempValue = array[index1]; //temp stores the value at index1
        array[index1] = array[index2];
        array[index2] = tempValue;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }

    }

    public static void main(String[] args) {
        // write your test code here
//        int[] array = {3, 1, 5, 99, 3, 12};
////      int[] array = {-1, 6, 9, 8, 12}; //ORIGINAL
//
//        System.out.println("Smallest: " + smallest(array));
//        System.out.println("Index of the smallest number: " + indexOfSmallest(array));
//        System.out.println(MainProgram.indexOfSmallestFrom(array, 0));
//        System.out.println(MainProgram.indexOfSmallestFrom(array, 1));
//        System.out.println(MainProgram.indexOfSmallestFrom(array, 2));
//        int[] array = {3, 2, 5, 4, 8};
//
//        System.out.println(Arrays.toString(array));
//
//        MainProgram.swap(array, 1, 0);
//        System.out.println(Arrays.toString(array));
//
//        MainProgram.swap(array, 0, 3);
//        System.out.println(Arrays.toString(array));

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

}
