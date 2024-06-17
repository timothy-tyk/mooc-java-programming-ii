
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
public class Box implements Packable{
    private ArrayList<Packable> packables;
    private double maxWeight;
    
    public Box(double max){
        this.maxWeight = max;
        this.packables = new ArrayList<>();
    }
    
    public void add(Packable p){
        if(this.weight()+p.weight()<this.maxWeight){
            packables.add(p);
            
        }
    }
    @Override
    public double weight(){
        double weight=0.0;
        for(Packable p: packables){
            weight+=p.weight();
        }
        return weight;
    }
    
    @Override
    public String toString(){
        return String.format("Box: %s items, total weight %s kg",packables.size(),this.weight());
    }
}
