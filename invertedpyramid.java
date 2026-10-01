import java.util.Scanner;

public class invertedpyramid {
    public static void main(String[] args) {
        for (int i = 3; i >= 1; i--) {
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i + (i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
