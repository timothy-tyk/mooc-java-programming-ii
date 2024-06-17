
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
public class HashMap<K,V> {
    private ArrayList<Pair<K,V>>[] map;
    private int firstFreeIndex;

    public HashMap() {
        this.map = new ArrayList[32];
        this.firstFreeIndex = 0;
    }
    
    public V get(K key){
        int keyHash = Math.abs(key.hashCode()%32);
        if(this.map[keyHash]==null){
            return null;
        }else{
            List<Pair<K,V>> list = this.map[keyHash];
            for(int i=0;i<list.size();i++){
                if(list.get(i).getKey()==key){
                    return list.get(i).getValue();
                }
            }
            return null;
        }
    }
    
    public void add(K key, V value){
        int keyHash = Math.abs(key.hashCode()%32);
        if(this.map[keyHash] == null){
            this.map[keyHash]= new ArrayList<>();
        }
        ArrayList<Pair<K,V>> list = this.map[keyHash];
        int index=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getKey()==key){
                index = i;
            }
        }
        if(index<0){
        list.add(new Pair(key,value));
        }else{
            list.get(index).setValue(value);
        }
    }
    
    public V remove(K key){
        int keyHash = Math.abs(key.hashCode()%32);
        if(this.map[keyHash] == null){
            this.map[keyHash]= new ArrayList<>();
        }
        ArrayList<Pair<K,V>> list = this.map[keyHash];
        if(list.isEmpty())return null;
        else{
            int index = -1;
            for(int i=0;i<list.size();i++){
                if(list.get(i).getKey()==key){
                    index=i;
                }
            }
            if(index<0){
                return null;
            }
            return list.remove(index).getValue();
        }
    }
    
    
}
