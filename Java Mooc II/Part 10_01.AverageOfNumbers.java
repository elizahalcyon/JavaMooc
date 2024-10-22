
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        List<String> input = new ArrayList<>();

        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }
            input.add(row);
        //  input.add(Integer.valueOf(row));
        }
        
        double average = input.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .average()
            .getAsDouble();

        System.out.println("average of the numbers: " + average);
    //  System.out.println("average of the numbers: " + input.stream().mapToInt(i -> i).average().getAsDouble());
    }
}
