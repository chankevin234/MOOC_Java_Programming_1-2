import java.util.ArrayList;
import java.util.Objects;

public class ChangeHistory {

    private ArrayList<Double> changeLog;

    public ChangeHistory() {
        this.changeLog = new ArrayList<>();
    }

    public void add(double status) {
        this.changeLog.add(status);
    }

    public void clear() {
        this.changeLog.clear();
    }

    @Override
    public String toString() {
        return changeLog.toString();
    }

    public double maxValue() {
        double maxValue = 0;
        if(this.changeLog.isEmpty()) {
            maxValue = 0;
            return maxValue;
        }

        for (double value : this.changeLog) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public double minValue() {
        if(this.changeLog.isEmpty()) {
            return 0;
        }

        double minValue = this.changeLog.get(0);

        for (double value : this.changeLog) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    public double average() {
        double average;
        double sum = 0;

        if(this.changeLog.isEmpty()) {
            average = 0;
            return average;
        }

        for (double value : this.changeLog) {
            sum += value;
        }

        average = sum / this.changeLog.size();
        return average;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.changeLog);
        return hash;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if(other == null) {
            return false;
        }

        if(getClass() != this.getClass()) {
            //not the same type
            return false;
        }

        final ChangeHistory otherObj = (ChangeHistory) other;
        if (!Objects.equals(this.changeLog, otherObj.changeLog)) {
            return false;
        }

        return true;
    }

}
