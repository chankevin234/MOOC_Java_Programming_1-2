public class Fitbyte {
    private int age;
    private int restingHeartRate;

    public Fitbyte(int initialAge, int intiialRestingHeartRate) {
        this.age = initialAge;
        this.restingHeartRate = intiialRestingHeartRate;
    }

    /*
     target heart rate = (maximum heart rate - resting heart rate) ...
     *                   * (target heart rate percentage) + resting heart rate
     */
    public double targetHeartRate(double percentMaxHeartRate) {
        double maxHeartRate = 206.3 - (0.711 * this.age);
        double targetHeartRate = (maxHeartRate - restingHeartRate) * percentMaxHeartRate + restingHeartRate;

        return targetHeartRate;
    }

    public String toString() {
        return "Fitbyte{" +
                "age=" + age +
                ", restingHeartRate=" + restingHeartRate +
                '}';
    }
}
