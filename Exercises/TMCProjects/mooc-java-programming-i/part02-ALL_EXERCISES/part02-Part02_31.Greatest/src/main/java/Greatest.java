public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int[] intArray = new int[]{number1, number2, number3};
        int greatest = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] >= greatest) {
                greatest = intArray[i];
            }
        }
        return greatest;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
