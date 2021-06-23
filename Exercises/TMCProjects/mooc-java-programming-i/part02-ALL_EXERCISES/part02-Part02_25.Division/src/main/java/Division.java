public class Division {

    public static void main(String[] args) {

        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"

        division(3, 5);
        divisibleByThreeInRange(3, 6);
    }

    // implement the method here
    public static void division(int numerator, int denominator) {
        double quotient = (double) numerator / denominator;
        System.out.println(quotient);
    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
