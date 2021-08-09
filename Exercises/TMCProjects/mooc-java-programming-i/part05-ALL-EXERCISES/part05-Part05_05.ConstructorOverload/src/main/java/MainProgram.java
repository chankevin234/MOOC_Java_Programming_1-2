public class MainProgram {

    public static void main(String[] args) {
        // Test your class here
        /*
         * technique of having two (or more) constructors in a class
         * is known as constructor overloading
         */
        Product tapeMeasure = new Product("Tape measure");
        Product plaster = new Product("Plaster", "his");
        Product tyre = new Product("Tyre", 5);
        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);
    }
}
