
import java.util.HashMap;

public class IOU {
    
    private HashMap<String, Double> ledger;
    
    public IOU() {
        this.ledger = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        ledger.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        if (ledger.containsKey(toWhom)) {
            return ledger.get(toWhom);
        } else {
            return 0;
        }
    }
}