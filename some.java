import java.util.Scanner;

public class some {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        outer:

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (a * i == b * j) {
                    System.out.println("LCM of " + a + " and " + b + " is: " + (a * i));
                    break outer;
                }
            }
        }

    }
}