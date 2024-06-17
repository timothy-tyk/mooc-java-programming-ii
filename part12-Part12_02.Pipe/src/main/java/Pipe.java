
import java.util.LinkedList;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timo
 */
public class Pipe<T> {
    private Queue<T> pipe;
    
    public Pipe(){
        this.pipe = new LinkedList<T>();
    }
    
    public void putIntoPipe(T value){
        this.pipe.add(value);
    }
    public T takeFromPipe(){
        if(this.pipe.isEmpty()){
            return null;
        }else{
            T item = this.pipe.remove();
            return item;
        }
    }
    public boolean isInPipe(){
        if(this.pipe.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
}
