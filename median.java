import java.util.Scanner;

public class median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int median = (a + b + c) / 3;

        System.out.println("The median is:" + median);
    }
}
