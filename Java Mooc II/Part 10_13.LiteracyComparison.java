
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class LiteracyComparison {
    
    public static void main(String[] args) {

        List<Literacy> literacy = new ArrayList<>();

            try {
                literacy = Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .map(parts -> new Literacy(parts[2].trim(), parts[3].trim(), Integer.valueOf(parts[4]), Double.valueOf(parts[5])))
                    .sorted()
                    .collect(Collectors.toCollection(ArrayList::new));
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
            
            literacy.stream().forEach(m -> System.out.println(m));
        
    }
}



  /* 
        

    try {
            
            Files.lines(Paths.get("literacy.csv"))
                .map(row -> row.split(","))
                .sorted((a, b) -> a[5].compareTo(b[5]))
                .forEach(parts -> System.out.println(parts[3] + " (" + parts[4] + "), " + parts[2].split(" ")[1].trim() + ", " + parts[5]));
                
                
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    */