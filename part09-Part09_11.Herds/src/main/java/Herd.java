
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timo
 */
public class Herd implements Movable{
    private List<Movable> movables;
    
    public Herd(){
        this.movables = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        this.movables.add(movable);
    }
    
    public void move(int dx, int dy){
        for(Movable m: this.movables){
            m.move(dx, dy);
        }
    }
    
    public String toString(){
        String result="";
        for(Movable m:this.movables){
            result+=m.toString()+"\n";
        }
        return result;
    }
}
