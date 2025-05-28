import java.util.Scanner;

public class P8_BankingProgram {
       static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        // Java banking program


        double balance=0.00;
        boolean isRunning = true;
        int choice;

        while(isRunning)
        {
            System.out.println(" Banking Program ");
            System.out.println("*****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            

            System.out.println("Enter your choice (1-4)");
            choice = scanner.nextInt();

            switch(choice)
            {
                case 1-> ShowBalance(balance);
                case 2-> balance = balance + deposit();
                case 3-> balance = balance - withdraw(balance);
                case 4-> isRunning = false;
                default -> System.out.println("Invalid choice");
                
            }
        }
        System.out.printf("**********************\n\n");
        System.out.println("ThankYou !!!");

        // Declare variables
        // Display menu
        // Get and process user choice
        // showBalance()
        // deposit()
        // withdraw()
        // Exit message

        scanner.close();

    }

    static void ShowBalance(double balance)
    {
        System.out.printf("$ %.2f \n\n", balance);
    }

    static double deposit()
    {
        double amount;
        System.out.print("Enter an amount to be deposited : ");
        amount = scanner.nextDouble();

        if(amount < 0)
        {
            System.out.println("Amount can't be negative. ");
            return 0;
        }
        else
        {
            return amount;
        }
        

    }

    static double withdraw(double balance)
    {
        double amount;

        System.out.println("Enter the amount to be withdrawn : ");
        amount = scanner.nextDouble();

        if(amount > balance)
        {
            System.out.println("Insufficient amount");
            return 0;
        }
        else if(amount < 0)
        {
            System.out.println("Amount can't be negative");
            return 0;
        
        }
        else
        {
            return amount;
        }
    }

}
