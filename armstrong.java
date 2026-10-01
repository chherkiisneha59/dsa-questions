import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int result = 0;

        for (int i = num; i > 0; i = i / 10) {
            int digit = i % 10;
            result = result + (digit * digit * digit);
        }
        if (result == num) {
            System.out.println("The number is armstrong.");
        } else {
            System.out.println("The number is not armstrong");
        }

    }

}