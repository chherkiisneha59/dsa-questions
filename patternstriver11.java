import java.util.Scanner;

public class patternstriver11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5 - i; j <= 5 - 1; j++) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
    }
}