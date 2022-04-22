
import java.util.ArrayList;


public class Herd implements Movable {
    
    private final ArrayList<Movable> herd;
    
    public Herd() {
        this.herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable member : herd) {
            member.move(dx, dy);
        }
    }
    
    @Override
    public String toString() {
        String list = "";
        for (Movable movable : herd) {
            list += movable.toString() + "\n";
        }
        return list;
    }
}