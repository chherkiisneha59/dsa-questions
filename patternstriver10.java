import java.util.Scanner;

public class patternstriver10 {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + j - 1));
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char) ('A' + j - 1));
            }
            System.out.println();
        }
    }
}