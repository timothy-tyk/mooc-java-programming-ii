
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
public class ChangeHistory {
    private ArrayList<Double> history;
    public ChangeHistory(){
        this.history = new ArrayList<>();
    }
    public void add(double status){
        this.history.add(status);
    }
    public void clear(){
        this.history.clear();
    }
    public String toString(){
        return this.history.toString();
    }
    public double maxValue(){
        Double max = this.history.get(0);
        for(Double d:this.history){
            if(d>max){
                max = d;
            }
        }
        return max;
    }
    public double minValue(){
        Double min = this.history.get(0);
        for(Double d:this.history){
            if(d<min){
                min = d;
            }
        }
        return min;
    }
    public double average(){
        Double total=0.0;
        int count=0;
        for(Double d:this.history){
            total+=d;
            count++;
        }
        return total/count;
    }
}
