
import java.util.ArrayList;

public class ChangeHistory {
    
    private ArrayList<Double> changes;
    
    public ChangeHistory() {
        this.changes = new ArrayList<>();
    }
    
    public ChangeHistory(double initialChange) {
        this.changes = new ArrayList<>();
        this.add(initialChange);
    }
    
    public void add(double status) {
        this.changes.add(status);
    }
    
    public void clear() {
        this.changes.clear();
    }
    
    public double maxValue() {
        if (this.changes.isEmpty()) {
            return 0;
        }
        double maxValue = this.changes.get(0);
        for (double value : this.changes) {
            maxValue = (value > maxValue) ? value : maxValue;
        }
        return maxValue;
    }
    
    public double minValue() {
         if (this.changes.isEmpty()) {
             return 0;
         }
         double minValue = this.changes.get(0);
         for (double value : this.changes) {
             minValue = (value < minValue) ? value : minValue;
         }
         return minValue;
    }
    
    public double average() {
        if (this.changes.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (double value : this.changes) {
            sum += value;
        }
        return sum / this.changes.size();
    }
    
    @Override
    public String toString() {
        return this.changes.toString();
    }
}