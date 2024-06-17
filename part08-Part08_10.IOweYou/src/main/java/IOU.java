
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
public class IOU {
    private HashMap<String, Double> owes;
    
    public IOU(){
        this.owes = new HashMap<>();
    }
    public void setSum(String toWhom, double amount){
        this.owes.put(toWhom, amount);
    }
    public double howMuchDoIOweTo(String toWhom){
        return this.owes.getOrDefault(toWhom, 0.0);
    }
}
