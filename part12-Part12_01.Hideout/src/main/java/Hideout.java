
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
public class Hideout<T> {
    private ArrayList<T> hideyHole;
    
    public Hideout(){
        this.hideyHole = new ArrayList<T>();
    }
    
    public void putIntoHideout(T toHide){
        if(this.hideyHole.isEmpty()){
        this.hideyHole.add(toHide);
        }else{
            this.hideyHole.clear();
            this.hideyHole.add(toHide);
        }
    }
    public T takeFromHideout(){
        if(this.hideyHole.isEmpty()){
            return null;
        }else{
        T obj = this.hideyHole.get(0);
        this.hideyHole.clear();
        return obj;
        }
    }
    public boolean isInHideout(){
        return !this.hideyHole.isEmpty();
    }
}
