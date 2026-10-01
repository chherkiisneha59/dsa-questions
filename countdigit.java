import java.util.Scanner;

public class countdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        for (int i = num; i != 0; i = i / 10) {
            count = count + 1;
        }
        System.out.println("The number of digits is : " + count);
    }
}