
import java.util.ArrayList;
import java.util.Iterator;
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
public class Employees {
    private ArrayList<Person> employees;
    
    public Employees(){
       this.employees = new ArrayList<Person>();     
    }
    
    public void add(Person personToAdd){
        this.employees.add(personToAdd);
    }
    public void add(List<Person> peopleToAdd){
        peopleToAdd.stream().forEach(e->this.employees.add(e));
    }
    public void print(){
        this.employees.stream().forEach(e -> System.out.println(e));
    }
    public void print(Education education){
        Iterator<Person> iterator = employees.iterator();
        while(iterator.hasNext()){
            Person p = iterator.next();
            if(p.getEducation() == education){
                System.out.println(p);
            }
        }
    }
    public void fire(Education education){
        Iterator<Person> iterator = employees.iterator();
        while(iterator.hasNext()){
            Person p = iterator.next();
            if(p.getEducation()==education){
                iterator.remove();
            }
        }
    }
}
