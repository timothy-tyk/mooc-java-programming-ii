
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timo
 */
public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todo, Scanner scan){
        this.todoList = todo;
        this.scanner = scan;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String input = this.scanner.nextLine();
            if(input.equals("stop")){
                break;
            }
            else if(input.equals("add")){
                System.out.print("To add: ");
                String todo = this.scanner.nextLine();
                this.todoList.add(todo);
            }else if(input.equals("list")){
                this.todoList.print();
            }else if(input.equals("remove")){
                System.out.print("Which one is removed? ");
                int idx = Integer.valueOf(this.scanner.nextLine());
                this.todoList.remove(idx);
            }
        }
    }
}
