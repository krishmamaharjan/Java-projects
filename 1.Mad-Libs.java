import java.util.scanner;
public class 1.Mad-Libs {
    public static void main(String[] args) {

        // MAD LIBS GAME

        Scanner scanner = new Scanner();

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("Enter an adjective (description) : ");
        adjective1 = scanner.nextLine();

        System.out.println("Enter a noun (animal or person) : ");
        noun1 = scanner.nextLine();

        System.out.println("Enter an adjective (description) : ");
        adjective2 = scanner.nextLine();

        System.out.println("Enter a verb end wit -ing (action) : ");
        verb1 = scanner.nextLine();

        System.out.println("Enter an adjective (description) : ");
        adjective3 = scanner.nextLine();


        System.out.println("Today I went to a " + adjective1 +" zoo.");
        System.our.println("In an exhibit, I saw a " + noun1 + ".");
        System.our.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.our.println("I was " + adjective3 + "!");

        scanner.close();
        
    }
}
