
import java.util.ArrayList;


public class Box implements Packable {
    
    private ArrayList<Packable> box;
    private double maxWeight;
    
    public Box(double maxWeight) {
        this.box = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    @Override
    public double weight() {
        double currentWeight = 0;
        for (Packable item : box) {
            currentWeight += item.weight();
        }
        return currentWeight;
    }
    
    public void add(Packable item) {
        if (this.weight() + item.weight() <= this.maxWeight) {
            this.box.add(item);
        }
    }
    
    @Override
    public String toString() {
        return "Box: " +this.box.size()+ " items, total weight " +this.weight()+ " kg";
    }
}