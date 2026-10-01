import java.util.Scanner;

public class largestdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int smallest = 9;

        for (int i = num; i > 9; i = i / 10) {
            int digit = i % 10;
            if (digit < smallest) {
                smallest = digit;
            }
        }
        System.out.print(smallest);
    }
}