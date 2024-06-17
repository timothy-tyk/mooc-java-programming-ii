
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timo
 */
public class Warehouse {
    private Map<String, Integer> products;
    private Map<String, Integer> stock;
    public Warehouse(){
        this.products = new HashMap<String, Integer>();
        this.stock = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.products.put(product, price);
        this.stock.put(product, stock);
    }
    public int price(String product){
       int price = this.products.getOrDefault(product, -99);
       return price;
    }
    public int stock(String product){
        int stock = this.stock.getOrDefault(product, 0);
        return stock;
    }
    public boolean take(String product){
        if(stock(product)>0){
            int currStock = stock(product);
            this.stock.put(product, currStock-1);
            return true;
        }else{
            return false;
        }
    }
    public Set<String> products(){
        return this.products.keySet();
    }
}
