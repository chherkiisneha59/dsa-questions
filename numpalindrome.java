import java.util.Scanner;

public class numpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int reverse = 0;

        for (int i = num; i != 0; i = i / 10) {
            int digit = i % 10;
            reverse = reverse * 10 + digit;
        }
        if (original == reverse) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }
    }
}