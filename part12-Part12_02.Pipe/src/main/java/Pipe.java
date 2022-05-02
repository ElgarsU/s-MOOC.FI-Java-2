
import java.util.LinkedList;


public class Pipe<T> {
    
    private LinkedList<T> pipe;
    
    public Pipe() {
        this.pipe = new LinkedList<>();
    }
    
    public void putIntoPipe(T value) {
        this.pipe.addLast(value);
    }
    
    public T takeFromPipe() {
        if (!this.pipe.isEmpty()) {
            T returnValue = this.pipe.getFirst();
            this.pipe.removeFirst();
            return returnValue;
        }
        else return null;
    }
    
    public boolean isInPipe() {
        return !this.pipe.isEmpty();
    }
}