import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + i - 1));
            }
            System.out.println();
        }
    }
}