import java.util.Scanner;

public class userInterface {

    private Gradebook gradebook; //the gradebook class
    private Scanner scanner; //scanner class to take userInput

    public userInterface(Gradebook gradebook, Scanner scanner) {
        this.gradebook = gradebook;
        this.scanner = scanner;
    }

    public void start() {

        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int point = Integer.valueOf(scanner.nextLine());
            if(point == -1) {
                break;
            }
            gradebook.addPoint(point);
        }

        /*
        * Part 1
        * */
        System.out.println("Point average (all): " + gradebook.pointAverages());

        /*
         * Part 2
         * */
        System.out.println("Point average (passing): " + gradebook.pointAverageForPassingGrade());


        /*
         * Part 3
         * */
        System.out.println("Pass percentage: " + gradebook.passPercentage());

        /*
         * Part 4
         * */
        gradebook.gradeDistribution();
    }
}
