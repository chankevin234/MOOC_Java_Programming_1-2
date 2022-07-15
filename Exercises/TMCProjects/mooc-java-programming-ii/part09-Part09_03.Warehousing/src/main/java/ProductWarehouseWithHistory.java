public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory changeHistoryTool = new ChangeHistory();

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.changeHistoryTool.add(initialBalance);

    }

    public String history() {
        return this.changeHistoryTool.toString();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.changeHistoryTool.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        this.changeHistoryTool.add(super.getBalance()-amount);

        return super.takeFromWarehouse(amount);
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.changeHistoryTool.toString());
        System.out.println("Largest amount of product: " + this.changeHistoryTool.maxValue());
        System.out.println("Smallest amount of product: " + this.changeHistoryTool.minValue());
        System.out.println("Average: " + this.changeHistoryTool.average());
    }


}
