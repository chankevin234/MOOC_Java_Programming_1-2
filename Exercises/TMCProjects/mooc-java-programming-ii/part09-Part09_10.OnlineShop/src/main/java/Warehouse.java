import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> priceOfEachProduct;
    private Map<String, Integer> stockOfEachProduct;

    public Warehouse() {
        this.priceOfEachProduct = new HashMap<>();
        this.stockOfEachProduct = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        //which adds a product to the warehouse with the price and stock balance given as parameters.
        this.priceOfEachProduct.put(product, price);
        this.stockOfEachProduct.put(product, stock);
    }

    public int price(String product) {
        // which returns the price of the product it received as a parameter.
        // If the product hasn't been added to the warehouse, the method must return -99.
        if (this.priceOfEachProduct.get(product) == null) {
            return -99;
        }
        return this.priceOfEachProduct.get(product);
    }

    public int stock(String product) {
        //returns the current remaining stock of the product in the warehouse.
        // If the product hasn't been added to the warehouse, the method must return 0.

        if (this.stockOfEachProduct.get(product) == null) {
            return 0;
        }
        return this.stockOfEachProduct.get(product);
    }

    public boolean take(String product) {
        // reduces the stock remaining for the product it received as a parameter by one, and returns true if there was stock remaining.
        // If the product was not available in the warehouse the method returns false. A products stock can't go below zero.
        if (this.stock(product) == 0) {
            return false;
        }
        stockOfEachProduct.put(product, stockOfEachProduct.get(product) - 1);
        return true;
    }

    public Set<String> products() {
        // return names of the products in the warehouse as a SET
        Set<String> namesOfProducts = new HashSet<>();

        for (String name : this.priceOfEachProduct.keySet()) {
            namesOfProducts.add(name);
        }

        return namesOfProducts;
    }

}
