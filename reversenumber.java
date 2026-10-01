import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = 0;

        for (int i = num; i != 0; i = i / 10) {
            int digit = i % 10;
            reverse = reverse * 10 + digit;
        }
        System.out.println("The reverse is :" + reverse);
    }
}