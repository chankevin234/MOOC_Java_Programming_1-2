import java.util.Map;

public class Item {

    private String product;
    private int quantity;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        //a constructor that creates an item corresponding to the product given as a parameter.
        // qty tells us how many of the product are in the item, while unitPrice is the price of a single product.
        this.product = product;
        this.quantity = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return this.unitPrice * this.quantity;
    }

    public void increaseQuantity() {
        this.quantity += 1;
    }

    public String toString() {
        return this.product + ": " + this.quantity;
    }
}
