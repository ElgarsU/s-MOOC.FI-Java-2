package FlightControl.domain;

public class Airplane {
    
    private final String name;
    private final int capacity;
    
    public Airplane (String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getCapacity() {
        return this.capacity;
    }
    
    @Override
    public String toString() {
        return this.getName()+ " (" +this.getCapacity()+ " capacity)";
    }
}