public class ProductWarehouse extends Warehouse {

    private String productName;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity); //the superclass "Warehouse" requires a capacity value to initiate
        this.productName = productName;
    }

    public String getName() {
        return this.productName;
    }

    public void setName(String newName) {
        this.productName = newName;
    }

    @Override
    public String toString() {
        return this.getName() + ": balance = " + super.getBalance() + ", space left " + super.howMuchSpaceLeft();
    }


}
