import java.util.Scanner;

public class countstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count = count + 1;
        }
        System.out.println("The number of characters in the string is : " + count);
    }
}