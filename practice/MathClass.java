package practice;
import java.util.Scanner;

public class MathClass {
        public static void main(String[] args) {
            // Math class

        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;

        result = Math.pow(2,3);
        result = Math.abs(-5);
        result = Math.sqrt(9);
        result = Math.round(3.14);
        result = Math.ceil(3.14);
        result = Math.floor(3.14);
        result = Math.max(10,20);
        result = Math.min(10,20);

        System.out.println(result);

        // Hypotenuse of right angle c= sqrt(a2 + b2)

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A : ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B : ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("The hypotenuse (side c) is " + c );

        scanner.close();



}
}
