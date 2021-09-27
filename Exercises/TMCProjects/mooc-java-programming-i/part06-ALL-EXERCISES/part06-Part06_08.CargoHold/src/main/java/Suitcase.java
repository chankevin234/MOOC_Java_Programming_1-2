import java.util.ArrayList;

public class Suitcase {
    //has "items" and a max weight
    private int maxWeight;
    private int currWeight;
    private ArrayList<Item> suitcase;

    public Suitcase(int weight) {
        this.maxWeight = weight;
        this.currWeight = 0;
        this.suitcase = new ArrayList<>();//instant a list for items
    }

    public Suitcase() {
        this.maxWeight = 0;
    }

    public void addItem(Item item) {
        if ((this.currWeight + item.getWeight()) <= this.maxWeight) {
            this.suitcase.add(item); //adds to arraylist
            this.currWeight += item.getWeight();
        } else {
            System.out.println("Not enough space, item not added!");
        }
    }

    public void printItems() {
        for (Item item : suitcase) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        return this.currWeight;
    }

    public Item heaviestItem() {
        if (this.suitcase.size() > 0) {
            Item heaviestItem = this.suitcase.get(0); //set initial heaviest item as first index
            for (Item item : suitcase) {
                if (heaviestItem.getWeight() < item.getWeight()) {
                    heaviestItem = item;
                }
            }
            return heaviestItem;
        } else {
            return null;
        }
    }

    public String toString() {
        if (this.suitcase.size() == 0) {
            return "no items (" + this.currWeight + " kg)";
        } else if (this.suitcase.size() == 1) {
            return this.suitcase.size() + " item (" + this.currWeight + " kg)";
        } else {
            return this.suitcase.size() + " items (" + this.currWeight + " kg)";
        }
    }
}
