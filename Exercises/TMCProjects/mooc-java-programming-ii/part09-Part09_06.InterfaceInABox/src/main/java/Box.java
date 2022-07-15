import java.util.ArrayList;

public class Box implements Packable {

    private ArrayList<Packable> itemsInBox;
    private double capacity;

    public Box(double maxCapacity) {
        this.capacity = maxCapacity;
        this.itemsInBox = new ArrayList<>();
    }

    public double weight() {

        double sum = 0;

        for(Packable item : this.itemsInBox) {
            sum += item.weight();
        }

        return sum;
    }

    public void add(Packable itemToPack) {
        if (this.weight() + itemToPack.weight() < this.capacity) {
            this.itemsInBox.add(itemToPack);
        }
    }

    public int totalItems() {
        return this.itemsInBox.size();
    }

    public String toString() {
        return "Box: " + this.totalItems() + " items, total weight " + this.weight() + " kg";
    }

}
