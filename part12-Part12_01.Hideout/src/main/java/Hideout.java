
public class Hideout<T> {
    
    private T value;
    
    public Hideout() {
        this.value = null;
    }
    
    public void putIntoHiduout(T toHide)     {
        this.value = toHide;
    }
    
    public T takeFromHidout() {
        T returnValue = this.value;
        this.value = null;
        return returnValue;
    }
    
    public boolean isInHideout() {
        if (this.value == null) {
            return false;
        } else {
            return true;
        }
    }
    
}