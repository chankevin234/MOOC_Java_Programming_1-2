import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private int currWeight;
    private ArrayList<Suitcase> hold;

    public Hold(int weight) {
        this.maxWeight = weight;
        this.currWeight = 0;
        this.hold = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if ((this.currWeight + suitcase.totalWeight()) <= this.maxWeight) {
            this.hold.add(suitcase);
            this.currWeight += suitcase.totalWeight();
        }
    }

    public void printItems() {
        for (Suitcase suitcase : hold) {
            suitcase.printItems();
        }
    }

    public String toString() {
        return this.hold.size() + " suitcases (" + this.currWeight + " kg)";
    }

}
