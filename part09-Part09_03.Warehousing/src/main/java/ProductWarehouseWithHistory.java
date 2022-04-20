
public class ProductWarehouseWithHistory extends ProductWarehouse {
    
    private ChangeHistory history;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity, initialBalance);
        history = new ChangeHistory(initialBalance);
    }
    
    public String history() {
        return this.history.toString();
    }
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        history.add(this.getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double removed = super.takeFromWarehouse(amount);
        history.add(this.getBalance());
        return removed;
    }
    
    public void printAnalysis() {
        System.out.println("Product: " +this.getName());
        System.out.println("History: " +history.toString());
        System.out.println("Largest amount of product: " +history.maxValue());
        System.out.println("Smallest amount of product: " +history.minValue());
        System.out.println("Average: " +history.average());
    }
}