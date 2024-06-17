
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
public class ProductWarehouse extends Warehouse{
    private String name;
    
    public ProductWarehouse(String productName, double capacity){
        super(capacity);
        this.name = productName;
    }
    
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name=newName;
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s",this.name,super.toString());
    }
}
