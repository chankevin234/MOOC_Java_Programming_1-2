
import java.util.Scanner;
import java.util.concurrent.BrokenBarrierException;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        birdInterface bInterface = new birdInterface(scan);

        bInterface.start();
    }

}
