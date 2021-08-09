public class Timer {
    private ClockHand hundreths;
    private ClockHand seconds;

    public Timer() {
        this.hundreths = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.hundreths.advance(); //auto inc. by 1 since the clockhand object has a method that updates by 1

        if (this.hundreths.value() == 0) {
            this.seconds.advance(); //advances once hundreths of a second = 1 sec
        }
    }

    public String toString() {
        return this.seconds + ":" + this.hundreths;
    }
}
