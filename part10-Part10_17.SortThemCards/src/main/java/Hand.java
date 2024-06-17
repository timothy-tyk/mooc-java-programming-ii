
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timo
 */
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;
    
    public Hand(){
        this.cards = new ArrayList<>();
    }
    public void add(Card card){
        this.cards.add(card);
    }
    public void print(){
        this.cards.stream().forEach(c -> System.out.println(c));
    }
    public void sort(){
        Collections.sort(cards);
    }

    @Override
    public int compareTo(Hand hand) {
        int currentHandValue = this.cards.stream().map(a -> a.getValue()).reduce(0, (a,b)->a+b);
        int compareHandValue = hand.cards.stream().map(a -> a.getValue()).reduce(0, (a,b)->a+b);
        return currentHandValue-compareHandValue;
    }
    
    public void sortBySuit(){
        Collections.sort(cards, new BySuitInValueOrder());
    }
    
}
