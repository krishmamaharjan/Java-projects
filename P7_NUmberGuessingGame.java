import java.util.Random;
import java.util.Scanner;
public class P7_NUmberGuessingGame {
    public static void main(String[] args)
    {
        //NUmber Guessing Game

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1,11);

        System.out.println("Number Guessing Game");

        System.out.println("Guess a number between 1-10: ");

        do { 
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber)
            {
                System.out.println("TOO LOW! Try again");
            }
            else if(guess > randomNumber)
            {
                System.out.println("TOO HIGH! Try again");
            }
            else 
            {
                System.out.println("Correct! The number was " + randomNumber);
                System.out.println("Number of attempts:  " + attempts);
            }
        } while (guess != randomNumber);

        System.out.println("You have won");
        scanner.close();
    }
}
