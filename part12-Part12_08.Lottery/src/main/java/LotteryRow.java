
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            int randomNumber = random.nextInt(40) + 1;
            if (!containsNumber(randomNumber)) {
                this.numbers.add(randomNumber);
            } else {
                i--;
            }
        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
    
}

