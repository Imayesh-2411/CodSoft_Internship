package Task1;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1;

        System.out.println("--------------- Number Game ---------------");
        System.out.print("Enter the number of attempts you want: ");
        int maxAttempts = scanner.nextInt();

        System.out.println("\nYou have " + maxAttempts + " attempts to guess the number.");
        System.out.println("Guess a number between 1 and 100: ");

        boolean guessedCorrectly = false;
        int numberOfAttempts = 0;
        while (!guessedCorrectly && numberOfAttempts < maxAttempts) {
            int userGuess = scanner.nextInt();
            numberOfAttempts++;

            if (userGuess == randomNumber) {
                guessedCorrectly = true;
            } else {
            	if(numberOfAttempts!=maxAttempts) {
            		if (userGuess > randomNumber) {
            			System.out.println("Your guess is too high. You have "+(maxAttempts-numberOfAttempts)+" Attempts left!\nTry Again: ");
            		} else {
            			System.out.println("Your guess is too low. You have "+(maxAttempts-numberOfAttempts)+" Attempts left!\nTry Again: ");
            		}
            	}
            }
        }
        scanner.close();
        if (guessedCorrectly) {
            System.out.println("Congratulations! You guessed correctly in "+numberOfAttempts+" attempts! The number was "+randomNumber+".");
        } else {
            System.out.println("Sorry, you ran out of guesses. The correct answer was " + randomNumber);
        }
    }
}
