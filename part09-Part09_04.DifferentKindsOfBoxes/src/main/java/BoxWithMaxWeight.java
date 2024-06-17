
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timo
 */
public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    @Override
    public void add(Item item){
        if(capacity - item.getWeight()>=0){
            this.items.add(item);
            this.capacity-=item.getWeight();
        }
    }
    
    @Override
    public boolean isInBox(Item item){
        for(Item i: this.items){
            if(item.equals(i)){
                return true;
            }
        }
        return false;
    }
}
