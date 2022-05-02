package dictionary;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class SaveableDictionary {
    
    private HashMap<String, String> dictionary;
    private String file;
    
    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }
    
    public boolean load() {
        try (Scanner scanner = new Scanner(Paths.get(this.file))) {
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                this.dictionary.putIfAbsent(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean save() {
// Method that adds new lines in existing file
//        try (FileWriter writer = new FileWriter(this.file, true)) {
//            for (Entry<String, String> entry : dictionary.entrySet()) {
//                writer.write(entry.getKey());
//                writer.write(":");
//                writer.write(entry.getValue());
//                writer.write("\n");
//            }
//            writer.close();
// Method that creates new file and overwrites all lines
        try (PrintWriter writer = new PrintWriter(this.file)) {
            for (Entry<String, String> entry : dictionary.entrySet()) {
                writer.print(entry.getKey());
                writer.print(":");
                writer.println(entry.getValue());
            }
            writer.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, translation);
    }
    
    public String translate(String word) {
        if (this.dictionary.get(word) != null) {
            return this.dictionary.get(word);
        } else {
            for (Entry<String, String> entry : dictionary.entrySet()) {
                if (entry.getValue().equals(word)) {
                    return entry.getKey();
                }
            }
        }
        return null;
    }
    
    public void delete(String word) {
        if (this.dictionary.get(word) != null) {
            this.dictionary.remove(word);
        } else {
            String key = null;
            for (Entry<String, String> entry : dictionary.entrySet()) {
                if (entry.getValue().equals(word)) {
                    key = entry.getKey();
                }
            }
            this.dictionary.remove(key);
        }
    }
}