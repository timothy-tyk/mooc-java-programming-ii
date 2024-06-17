/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author timo
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> store;
    public StorageFacility(){
        this.store = new HashMap<String, ArrayList<String>>();
    }
    public void add(String unit, String item){
        ArrayList<String> contents = contents(unit);
        contents.add(item);
        this.store.put(unit, contents);
    }
    public ArrayList<String> contents(String storageUnit){
        if(this.store.containsKey(storageUnit)){
            return this.store.get(storageUnit);
        }else{
            return new ArrayList<String>();
        }
    }
    public void remove(String storageUnit, String item){
        ArrayList<String> contents = contents(storageUnit);
        contents.remove(item);
        if(contents.size()==0){
            this.store.remove(storageUnit);
        }
        else{
            this.store.put(storageUnit, contents);
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> keys = new ArrayList<String>();
        for(String key:this.store.keySet()){
            keys.add(key);
        }
        return keys;
    }
}
