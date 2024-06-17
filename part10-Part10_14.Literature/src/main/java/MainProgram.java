
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while(true){
            System.out.println("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.println("Input the age recommendation: ");
            Integer age = Integer.valueOf(scanner.nextLine());
            books.add(new Book(name, age));
        }
        System.out.println(books.size()+" books in total.");
        books.stream()
                .sorted(Comparator.comparing(Book::getAge).thenComparing(Book::getName))
                .forEach(s -> System.out.println(s));
    }

}
