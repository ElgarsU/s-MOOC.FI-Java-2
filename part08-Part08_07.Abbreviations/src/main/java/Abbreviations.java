
import java.util.HashMap;

public class Abbreviations {
    
    private HashMap<String, String> list;
    
    public Abbreviations() {
        this.list = new HashMap<>();
    }
    
    public static String clean(String input) {
        String output = input.toLowerCase().trim();
        return output;
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        list.put(clean(abbreviation), explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        return list.containsKey(clean(abbreviation));
    }
    
    public String findExplanationFor(String abbreviation) {
        return list.get(clean(abbreviation));
    }
}