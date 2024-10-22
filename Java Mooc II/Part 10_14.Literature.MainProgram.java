
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }
            System.out.print("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            books.add(new Book(title, age));
        }

        Comparator<Book> compare = Comparator
            .comparing(Book::getRecMinAge)
            .thenComparing(Book::getTitle);

        Collections.sort(books, compare);
 
        System.out.println(books.size() + " books in total.");
        System.out.println("\n" + "Books:");

        for (Book b: books) {
            System.out.println(b);
        }
    }

}
