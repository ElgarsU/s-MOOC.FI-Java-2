
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    
    private HashMap<String, ArrayList<String>> translations;
    
    public DictionaryOfManyTranslations() {
        this.translations = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        this.translations.putIfAbsent(word, new ArrayList<>());
        
        this.translations.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word) {
        ArrayList<String> translated = new ArrayList<>();
        if (this.translations.containsKey(word)) {
            translated = this.translations.get(word);
        }
        return translated;
    }
    
    public void remove(String word) {
        this.translations.remove(word);
    }
}