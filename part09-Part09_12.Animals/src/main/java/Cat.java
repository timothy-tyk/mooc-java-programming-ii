/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timo
 */
public class Cat extends Animal implements NoiseCapable{
    public Cat(){
        super("Cat");
    }
    public Cat(String name){
        super(name);
    }
    public void purr(){
        System.out.println(super.getName()+" purrs");
    }
//    public void eat(){
//        super.eat();
//    }
//    public void sleep(){
//        super.sleep();
//    }
    @Override
    public void makeNoise(){
        purr();
    }
    
}
