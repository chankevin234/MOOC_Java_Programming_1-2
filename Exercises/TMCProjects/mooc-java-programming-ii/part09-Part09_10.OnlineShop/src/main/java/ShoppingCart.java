import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> itemMap;

    public ShoppingCart() {
        this.itemMap = new HashMap<>();
    }

    public void add(String product, int price) {
        // adds an item to the cart that matches the product given as a parameter, with the price given as a parameter.
        if (itemMap.keySet().contains(product)) { // if the product is one of the keys in the map, return true
            itemMap.get(product).increaseQuantity();
        }
        else {
            itemMap.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        //prints the total price of the whole shopping cart
        int subtotal = 0;
        for (Item item : itemMap.values()) {
            subtotal += item.price();
        }

        return subtotal;
    }

    public void print() {
        //The method prints the Item-objects in the cart
        for (Item item : itemMap.values()) {
            System.out.println(item);
        }
    }


}
