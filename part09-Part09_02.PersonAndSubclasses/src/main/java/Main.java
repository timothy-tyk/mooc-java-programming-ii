
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        // write your test code here
        Student student = new Student("Kenny", "23");

    Person person = student;
    Object object = student;

    System.out.print(student + ", ");
    System.out.print(person + ", ");
    System.out.println(object);
    }
    
    public static void printPersons(ArrayList<Person> persons){
        for(Person p:persons){
            System.out.println(p);
        }
    }

}
