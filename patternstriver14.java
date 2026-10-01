import java.util.Scanner;

public class patternstriver14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("4");
                } else if (i == 1 || i == size - 2 || j == 1 || j == size - 2) {
                    System.out.print("3");
                } else if (i == 2 || i == size - 3 || j == 2 || j == size - 3) {
                    System.out.print("2");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}