
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    public static List<Book> readBooks(String file) {
        List<Book> books = new ArrayList<>();
        
        try {
            books = Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .filter(row -> row.length >= 4)
                    .map(row -> new Book(row[0], Integer.valueOf(row[1]), Integer.valueOf(row[2]), row[3]))
                    //.forEach(book -> books.add(book))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Error: " +e);
        }
        return books;
    }
}
