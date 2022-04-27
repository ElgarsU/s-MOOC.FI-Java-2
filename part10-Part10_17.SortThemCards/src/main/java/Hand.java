
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Hand implements Comparable<Hand>{
    
    private List<Card> hand;
    
    public Hand() {
        this.hand = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.hand.add(card);
    }
    
    public void print() {
        this.hand.stream().forEach(card -> System.out.println(card));
    }
    
    public void sort() {
        Collections.sort(hand);
    }
    
    public void sortBySuit() {
        Comparator<Card> comparator = Comparator
                .comparing(Card::getSuit)
                .thenComparing(Card::getValue);
        Collections.sort(this.hand, comparator);
    }
    
    @Override
    public int compareTo(Hand other) {
        int hand1 = this.hand.stream().mapToInt(card -> card.getValue()).sum();
        int hand2 = other.hand.stream().mapToInt(card -> card.getValue()).sum();
        return hand1 - hand2;
    }
}