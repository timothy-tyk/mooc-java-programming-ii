
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstAmount =0;
        int secondAmount=0;

        while (true) {
            System.out.println(String.format("First: %s/100",firstAmount));
            System.out.println(String.format("Second: %s/100",secondAmount));
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] command = input.split(" ");
            int amount = Integer.valueOf(command[1]);
            if(command[0].equals("add")){
                if(amount>0){
                    if(firstAmount+amount>100){
                        firstAmount=100;
                    }else{
                        firstAmount+=amount;
                    }
                }
            }else if(command[0].equals("move")){
                if(amount>0){
                    if(firstAmount<amount){
                        secondAmount+=firstAmount;
                        firstAmount=0;
                        if(secondAmount>100){
                            secondAmount=100;
                        }
                    }else{
                        firstAmount-=amount;
                        secondAmount+=amount;
                        if(secondAmount>100){
                            secondAmount=100;
                        }
                    }
                }
                
            }else if(command[0].equals("remove")){
                if(amount>0){
                    if(secondAmount-amount<0){
                        secondAmount=0;
                    }else{
                        secondAmount-=amount;
                    }
                }
                
            }

        }
    }

}
