import java.util.Scanner;
public class P2_ShoppingCart
{
    public static void main(String[] args) {
        
        // Shopping Cart Program

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        // String currency = 'रू';
        String currency = "NPR";
        double total;

        System.out.print("What item would you like to buy? : ");
        item = scanner.nextLine();

        System.out.print("What is the price for each? : ");
        price = scanner.nextDouble();

        // System.out.println(price);

        System.out.print("How many would you like? : ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\n You have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);
    


        scanner.close();
    }
}