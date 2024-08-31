import java.util.*;

public class java13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int lowerBound = 1;
        int upperBound = 100;
        System.out.println("Guess a number between 1 and 100:");
        
        while (true) {
            int guess = scanner.nextInt(); // Move the input inside the loop
            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Too low.");
                lowerBound = guess + 1; // Adjust lower bound for binary search
            } else {
                System.out.println("Too high.");
                upperBound = guess - 1; // Adjust upper bound for binary search
            }
        }
    }
}
