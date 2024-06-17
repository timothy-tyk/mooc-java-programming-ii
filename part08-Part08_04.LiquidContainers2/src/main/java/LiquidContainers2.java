
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: "+first);
            System.out.println("Second: "+second);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] command = input.split(" ");
            int amount = Integer.valueOf(command[1]);
            if(command[0].equals("add")){
                first.add(amount);
            }else if(command[0].equals("move")){
                if(amount>first.contains()){
                    second.add(first.contains());
                    first.remove(first.contains());
                }else{
                    first.remove(amount);
                    second.add(amount);
                }
                
            }else if(command[0].equals("remove"))
                second.remove(amount);
        }
    }

}
