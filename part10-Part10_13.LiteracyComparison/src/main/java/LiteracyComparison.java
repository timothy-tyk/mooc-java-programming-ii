
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        scanAndSortFromFile();
        
    }
    
    public static void scanAndSortFromFile(){
        ArrayList<Statistic> list = new ArrayList<>();
        try{
            Scanner scanner = new Scanner(Paths.get("literacy.csv"));
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] split = line.split(",");
                Statistic stat = new Statistic(
                        split[0].trim(), 
                        split[1].trim(),
                        split[2].replace("(%)", "").trim(),
                        split[3].trim(),
                        Integer.valueOf(split[4].trim()),
                        Double.valueOf(split[5].trim())
                );
                list.add(stat);
            }
        }catch(IOException e){
            System.out.println(e);
        }
        
        list.stream().sorted((a,b)->a.getLiteracy().compareTo(b.getLiteracy())).forEach(s->System.out.println(s));
    }
}
