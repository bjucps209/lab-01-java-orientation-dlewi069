import java.util.*;

public class Guess {
    public static void main(String[] args) {
        int secretNum = (int)(Math.random() * 11);
        int numGuesses = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        int guess = scanner.nextInt();
        while (guess != secretNum) {
            numGuesses += 1;
            if (guess < secretNum) {
                System.out.println("Your guess is too low.");
            } else if (guess > secretNum) {
                System.out.println("Your guess is too high.");
            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
        }
        System.out.println("You got it!!");
        System.out.println("It took you " + numGuesses + " guesses.");
    }
}    

