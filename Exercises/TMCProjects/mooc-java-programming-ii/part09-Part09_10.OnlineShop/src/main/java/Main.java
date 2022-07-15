

public class Main {

    public static void main(String[] args) {
        // Test your app here
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("coffee", 5, 6);
        warehouse.addProduct("buttermilk", 2, 20);
        warehouse.addProduct("yogurt", 2, 20);

        System.out.println("products:");

        for (String product: warehouse.products()) {
            System.out.println(product);
        }

        Item item = new Item("milk", 4, 2);
        System.out.println("an item that contains 4 milks has the total price of " + item.price());
        System.out.println(item);
        item.increaseQuantity();
        System.out.println(item);
    }
}
