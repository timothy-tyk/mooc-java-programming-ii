
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timo
 */
public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;
    
    public VehicleRegistry(){
        this.registry = new HashMap<LicensePlate, String>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(!this.registry.containsKey(licensePlate)){
            this.registry.put(licensePlate, owner);
            return true;
        }else{
            return false;
        }
    }
    
    public String get(LicensePlate licensePlate){
        return this.registry.get(licensePlate);
    }
    public boolean remove(LicensePlate licensePlate){
        if(this.registry.containsKey(licensePlate)){
            this.registry.remove(licensePlate);
            return true;
        }else{
            return false;
        }
    }
    public void printLicensePlates(){
        for(LicensePlate lp: this.registry.keySet()){
            System.out.println(lp.toString());
        }
    }
    public void printOwners(){
        ArrayList<String> owners = new ArrayList<String>();
        for(String owner: this.registry.values()){
            if(!owners.contains(owner)){
                owners.add(owner);
            }
        }
        for(String o:owners){
            System.out.println(o);
        }
    }
}
