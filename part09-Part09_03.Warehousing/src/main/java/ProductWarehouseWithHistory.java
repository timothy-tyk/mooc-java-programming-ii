/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timo
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory changeHistory;
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        super.setBalance(initialBalance);
        this.changeHistory= new ChangeHistory();
        this.changeHistory.add(initialBalance);
    }
    public String history(){
        return this.changeHistory.toString();
    }
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        double balance = super.getBalance();
        this.changeHistory.add(balance);
    }
    public double takeFromWarehouse(double amount){
        double take =super.takeFromWarehouse(amount);
        double balance = super.getBalance();
        this.changeHistory.add(balance);
        return take;
    }
    public void printAnalysis(){
        System.out.println("Product: "+super.getName());
        System.out.println("History: "+this.changeHistory.toString());
        System.out.println("Largest amount of product: "+this.changeHistory.maxValue());
        System.out.println("Smallest amount of product: "+this.changeHistory.minValue());
        System.out.println("Average: "+this.changeHistory.average());
    }
    
}
