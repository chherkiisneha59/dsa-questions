import java.util.Scanner;

public class value {
    public static void main(String[] args) {

        for (int i = 1; i <= 26; i++) {
            System.out.println((char) ('A' + i - 1) + " " + ('A' + 1 - i));
        }
        System.out.println();
    }
}
