
import java.util.ArrayList;


public class BoxWithMaxWeight extends Box {
    
    private int capacity;
    private ArrayList<Item> contents;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.contents = new ArrayList<>();
    }
    
    private int totalWeight() {
        int totalWeight = 0;
        for (Item item : this.contents) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    
    @Override
    public void add(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.capacity) {
            contents.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
        return this.contents.contains(item);
    }
}