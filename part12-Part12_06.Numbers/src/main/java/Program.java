
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers should be printed? ");
        int num = Integer.valueOf(scanner.nextLine());
        for(int i=0;i<num;i++){
            int n = generateRandomNumber(10);
            System.out.println(n);
        }
    }
    public static int generateRandomNumber(int bound){
        Random ran = new Random();
        return ran.nextInt(bound+1);
    }
    
    

}
