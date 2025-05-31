import java.util.Random;
import java.util.Scanner;

public class P9_DiceRoller {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Java DICE ROLLER PROGRAM

        Random random = new Random();
        int numofDice;
        int total = 0;

        System.out.print("Enter the No. of dice to roll : ");
        numofDice = scanner.nextInt();

        if(numofDice > 0)
        {

            for(int i =0; i< numofDice; i++)
            {
                int roll = random.nextInt(1,7);
                printDie(roll);
                System.out.println("You rolled : " + roll);
                total = total + roll;
            }
            System.out.println("Total : "+ total);
        }
        else{
            System.out.println("No. of dice must be greater than 0.");
        }

        scanner.close();
        // Declarevariables
        // get # of dice from the user
        // check id # of dice > 0
        // Roll all the dice
        // get the total
        // display ASCII of dice 
    }



    static void printDie(int roll)
    {
        // Anything between """; is a mutiline string.
        String dice1 = """
                ---------
                |       |
                |   ●   |
                |       |
                ---------
                """;
                // System.out.print(dice1);
        String dice2 = """
                ---------
                | ●     |
                |       |
                |     ● |
                ---------
                """;
        String dice3 = """
                ---------
                | ●     |
                |   ●   |
                |     ● |
                ---------
                """;

        String dice4 = """
                ---------
                | ●   ● |
                |       |
                | ●   ● |
                ---------
                """;
        String dice5 = """
                ---------
                | ●   ● |
                |   ●   |
                | ●   ● |
                ---------
                """;
        String dice6 = """
                ---------
                | ● ● ● |
                |       |
                | ● ● ● |
                ---------
                """;

        switch(roll)
        {
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);

            default -> System.out.println("Invalid roll.");
        }
    }

}
