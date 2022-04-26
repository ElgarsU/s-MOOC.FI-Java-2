
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args)  {
        
        List<LiteracyData> data = new ArrayList<>();
        
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .map(parts -> new LiteracyData(parts[3], Integer.valueOf(parts[4]), parts[2].replace(" (%)", "").trim(), Double.valueOf(parts[5])))
                    .forEach(dataRow -> data.add(dataRow));
           
        } catch (Exception e) {
            System.out.println("Error: " +e.getMessage());
        }
        
        data.stream()
                .sorted()
                .forEach(entry -> System.out.println(entry));
    }
}
