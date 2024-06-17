/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timo
 */
public class List<T> {
    private T[] array;
    private int nextFreeIndex;
    
    public List(){
        this.array = (T[])new Object[10];
        this.nextFreeIndex=0;
    }
    
    public void add(T value){
        if(this.nextFreeIndex == this.array.length){
            grow();
        }
        this.array[this.nextFreeIndex] = value;
        this.nextFreeIndex++;
    }
    
    public void grow(){
        int newSize = this.nextFreeIndex+this.nextFreeIndex/2;
        T[] newList = (T[]) new Object[newSize];
        for(int i=0;i<this.nextFreeIndex;i++){
            newList[i] = this.array[i];
        }
        this.array = newList;
    }
    
    public boolean contains(T value){
        for(int i=0;i<this.nextFreeIndex;i++){
            if(this.array[i]==value || this.array[i].equals(value)){
                return true;
            }
        }
        return false;
    }
    
    public void remove(T value){
        boolean found = false;
        for(int i=0;i<this.nextFreeIndex;i++){
            if(found){
                
            }
            if(this.array[i]==value || this.array[i].equals(value)){
                this.array[i]=null;
                this.nextFreeIndex--;
                found = true;
            }
        }
    }
    public void rearrangeAfterRemove(int index){
        for(int i=index;i<this.nextFreeIndex;i++){
            this.array[i]=this.array[i+1];
        }
    }
}
