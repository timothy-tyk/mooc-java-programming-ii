
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        while(true){
            String input = scanner.nextLine();
            int num = Integer.valueOf(input);
            if(num==0){
                break;
            }
            if(num>0){
                nums.add(num);
            }
        }
        int total=0;
        int count=0;
        for(int n:nums){
            total+=n;
            count++;
        }
        if(count==0){
            System.out.println("Cannot calculate the average");
        }else{
            double average = (double)total/count;
            System.out.println(average);
        }
        
    }
}
