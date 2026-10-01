import java.util.Scanner;

public class hollowrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}