
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        // toteuta ohjelmasi tänne
        System.out.println("Input numbers, type end to stop");
        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            int n = Integer.valueOf(input);
            nums.add(n);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();
        if(input.equals("n")){
            double negative = nums.stream().mapToInt(s->Integer.valueOf(s)).filter(s->s<0).average().getAsDouble();
            System.out.println("Average of the negative numbers: "+negative);
        }else if(input.equals("p")){
            double positive = nums.stream().mapToInt(s->Integer.valueOf(s)).filter(s->s>0).average().getAsDouble();
            System.out.println("Average of the positive numbers: "+positive);
        }
    }   
    
}
