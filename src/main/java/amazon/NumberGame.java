package amazon;

import java.util.Scanner; // to get user input
import java.util.Random; // to generate random numbers

public class NumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create a scanner object
        Random random = new Random(); // create a random object

        int secret = random.nextInt(100) + 1; // generate a secret number between 1 and 100
        int guess = 0; // initialize the user's guess
        int attempts = 0; // initialize the number of attempts

        boolean won = false; // initialize the game status

        System.out.println("Welcome to the number game!");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("Can you guess it?");

        // loop until the user guesses the secret number or runs out of attempts
        while (!won && attempts < 10) {
            System.out.print("Enter your guess: "); // prompt the user for a guess
            guess = scanner.nextInt(); // read the user's guess
            attempts++; // increment the number of attempts

            // check if the guess is correct, too high, or too low
            if (guess == secret) {
                won = true; // set the game status to won
            } else if (guess > secret) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Your guess is too low.");
            }
        }

        // display the game result
        if (won) {
            System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
        } else {
            System.out.println("Sorry, you ran out of attempts. The number was " + secret + ".");
        }

        scanner.close(); // close the scanner
    }
}