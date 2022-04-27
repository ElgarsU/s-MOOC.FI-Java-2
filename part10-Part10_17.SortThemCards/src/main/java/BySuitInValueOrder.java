
import java.util.Comparator;


public class BySuitInValueOrder implements Comparator<Card> {
    
    @Override
    public int compare(Card first, Card second) {
        if (first.getSuit().ordinal() - second.getSuit().ordinal() == 0) {
            return first.getValue() - second.getValue();
        } else {
            return first.getSuit().ordinal() - second.getSuit().ordinal();
        }
    }

}