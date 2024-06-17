/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timo
 */
public class Book {
    private String name;
    private Integer age;
    
    public Book(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return this.name;
    }
    
    public Integer getAge(){
        return this.age;
    }
    
    public String toString(){
        return String.format("%s (recommended for %s year-olds or older)",this.name, this.age);
    }
}
