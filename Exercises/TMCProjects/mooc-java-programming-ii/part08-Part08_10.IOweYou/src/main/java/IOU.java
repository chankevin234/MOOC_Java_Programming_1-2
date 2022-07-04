import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> IOU;

    public IOU() {
        this.IOU = new HashMap<String, Double>();
    }

    public void setSum(String toWhom, double amount) {
        this.IOU.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        Double amountOwed = this.IOU.getOrDefault(toWhom, 0.0);
        return amountOwed;
    }
}
