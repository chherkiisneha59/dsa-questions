import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 3; i++) {
            for (int j = i + 1; j <= 4 + i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
    }
}