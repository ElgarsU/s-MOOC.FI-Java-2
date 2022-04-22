
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Warehouse {
    
    private Map<String, Integer> warehouse;
    private Map<String, Integer> stock;
    
    public Warehouse() {
        this.warehouse = new HashMap<>();
        this.stock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.warehouse.put(product, price);
        this.stock.put(product, stock);
    }
    
    public int price(String product) {
        if (this.warehouse.containsKey(product)) {
            return this.warehouse.get(product);
        } else {
            return -99;
        }    
    }
    
    public int stock(String product) {
        if (this.stock.containsKey(product)) {
            return this.stock.get(product);
        } else {
            return 0;
        }
    }
    
    public boolean take(String product) {
        if (this.stock.containsKey(product) && this.stock.get(product) > 0) {
            int remaining = this.stock.get(product) - 1;
            this.stock.put(product, remaining);
            return (remaining > 0);
        } else {
            return false;
        }
    }
    
    public Set<String> products() {
        return this.warehouse.keySet();
    }
    
    
}