
import java.util.HashMap;

public class Program {
    
    public static void printValues(HashMap<String, Book> hashmap) {
        //prints all the values in the hashmap given as 
        //a parameter using the toString method of the Book objects.
        for (Book book : hashmap.values()) {
            System.out.println(book.toString());
        }
    }
    
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        //prints only the Books in the given hashmap which name 
        //contains the given string. You can find out the name 
        //of a Book with the method getName
        for (Book book : hashmap.values()) {
            if (!(book.getName().contains(clean(text)))) {
                continue;
            }
            System.out.println(book.toString());
        }
    }
    
    public static String clean(String input) {
        return input.toLowerCase().trim();
    }

    public static void main(String[] args) {
        // Test your program here!
    }

}
