
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<Integer> inputs = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String number = scanner.nextLine();
            if (number.equals("end")) {
                break;
            }
            inputs.add(Integer.valueOf(number));
        }

        System.out.println("Print the average of the neagtive numbers or the positive numbers? (n/p)");
        String response = scanner.nextLine();

        if (response.equals("n")) {
            System.out.println("Average of the negative numbers: " + inputs.stream().mapToInt(i -> i).filter(number -> number < 0).average().getAsDouble());            
        //  System.out.println("Average of the negative numbers: " + input.stream().filter(l -> l < 0).mapToInt(i -> i).average().getAsDouble());
        }
        if (response.equals("p")) {
            System.out.println("Average of the positive numbers: " + inputs.stream().mapToInt(i -> i).filter(number -> number > 0).average().getAsDouble());
        }

        
    }
}
