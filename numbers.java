import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N >= 90 && N <= 100) {
            System.out.println("A");

        } else if (N >= 75 && N <= 89) {
            System.out.println("B");
        } else if (N >= 60 && N <= 74) {
            System.out.println("C");
        } else if (N >= 40 && N <= 59) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }
}