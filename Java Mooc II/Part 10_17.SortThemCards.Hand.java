import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    // creates array of Cards
    private List<Card> hand;

    // constructor
    public Hand() {
        this.hand = new ArrayList<>();
    }

    // method to add cards to hand array
    public void add(Card card) {
        this.hand.add(card);
    }

    // method to print all cards in hand
    public void print() {
        for (Card c: hand) {
            System.out.println(c);
        }
    }

    public int total() {
        int total = 0;
        for (Card c: hand) {
            total += c.getValue();
        }
        return total;
    }

    // method to sort cards in hand by value
    public void sort() {
        Collections.sort(hand);
    }

    // method to compare two hands of cards; need to add all values from items in array
    @Override
    public int compareTo(Hand other) {
        return this.total() - other.total();
    }

    public void sortBySuit() {

        Collections.sort(this.hand, new BySuitInValueOrder());
            
    }
}
