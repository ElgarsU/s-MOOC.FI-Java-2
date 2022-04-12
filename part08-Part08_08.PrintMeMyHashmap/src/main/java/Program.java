
import java.util.HashMap;

public class Program {
    
    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }
    
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(clean(text))) {
                System.out.println(key);
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(clean(text))) {
                System.out.println(hashmap.get(key));
            }
        }
    }
    
    public static String clean(String input) {
        return input.toLowerCase().trim();
    }

    public static void main(String[] args) {
        // Test your program here!
    }

}
