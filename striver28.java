import java.util.Scanner;

public class striver28 {

    static void check(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        check(8);
        check(16);
    }
}