
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        while (true) {
            String input = scanner.nextLine();
            if (Integer.valueOf(input) < 0) {
                break;
            }
            list.add(input);
        }
        list.stream()
                .mapToInt(number -> Integer.valueOf(number))
                .filter(number -> ((number >= 1) && (number <= 5)))
                .forEach(number -> System.out.println(number));
    }
}
