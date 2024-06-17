
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timo
 */
public class ShoppingCart {
    private Map<String,Item> items;
    
    public ShoppingCart(){
        this.items = new HashMap<>();
    }
    public void add(String product, int price){
        if(this.items.containsKey(product)){
            Item itm = this.items.get(product);
            itm.increaseQuantity();
        }else{
            this.items.put(product, new Item(product, 1, price));
        }
        
    }
    public int price(){
        int total=0;
        for(Item i:this.items.values()){
            total+=i.price();
        }
        return total;
    }
    public void print(){
        for(Item i: this.items.values()){
            System.out.println(i);
        }
    }
            
}
