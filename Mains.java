import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number1");
        double a = sc.nextDouble();
        System.out.println("You entered: " + a);

        System.out.println("Enter your number2");
        double b = sc.nextDouble();
        System.out.println("You entered: " + b);

        System.out.println("The Quotient is: " + (a / b));
    }
}