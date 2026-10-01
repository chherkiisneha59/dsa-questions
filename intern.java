import java.util.Scanner;

public class intern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N % 2 == 0 && N > 0) {
            System.out.println("Even and Positive");
        } else if (N % 2 == 0 && N < 0) {
            System.out.println("Even and Negative");
        } else if (N % 2 != 0 && N > 0) {
            System.out.println("Odd and Positive");
        } else if (N % 2 != 0 && N < 0) {
            System.out.println("Odd and Negative");
        }
    }
}