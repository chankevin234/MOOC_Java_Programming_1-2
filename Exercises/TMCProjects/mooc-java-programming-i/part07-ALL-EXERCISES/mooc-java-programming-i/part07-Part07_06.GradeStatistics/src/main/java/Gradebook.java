
import java.util.ArrayList;
import java.util.Arrays;

public class Gradebook {

    private ArrayList<Integer> points;
    private ArrayList<Integer> passingPoints;

    public Gradebook() {
        this.points = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
    }

    public void addPoint(int grade) {
        if (grade >= 0 && grade <= 100) {
            points.add(grade);
        } else {
            System.out.println("Invalid grade");
        }
    }

    public double pointAverages() {
        int sum = 0;
        for (int point : this.points) {
            sum += point;
        }
        double pointAverage = (double) sum / this.points.size();
        return pointAverage;
    }

    public String pointAverageForPassingGrade() {
//        ArrayList<Integer> passingPoints = new ArrayList<>();

        for (int point : this.points) {
            if (point >= 50 && point <= 100) {
                this.passingPoints.add(point);
            }
        }
        if (this.passingPoints.size() == 0) {
            return "-";
        }



        double sum = 0;
        for (int passPoints : this.passingPoints) {
            sum += passPoints;
        }

        return sum / this.passingPoints.size() + "";
    }

    public double passPercentage() {
        double passPercentage = (double) this.passingPoints.size() / this.points.size() * 100;
        return passPercentage;
    }

    public void gradeDistribution() {
        int[] distribution = new int[6];

        for (int point : this.points) {

            if (point >= 90) {
                distribution[0]++;

            } else if (point <= 89 && point > 79) {
                distribution[1]++;
            } else if (point <= 79 && point > 69) {
                distribution[2]++;
            } else if (point <= 69 && point > 59) {
                distribution[3]++;
            } else if (point <= 59 && point > 49) {
                distribution[4]++;
            } else {
                distribution[5]++;
            }
        }
        System.out.println("Grade distribution");
//        System.out.println(Arrays.toString(distribution));

        int index = 5;
        for (int star : distribution) {
            System.out.print(index + ": ");

            for (int i = 0; i < star; i++) {
                System.out.print("*");
            }
            System.out.print("\n"); //line break
            index--;
        }
    }
}
