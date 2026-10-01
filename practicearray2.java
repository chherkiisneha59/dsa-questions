import java.util.Scanner;

public class practicearray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i <= arr.length; i++) {
            count++;

        }
        System.out.print("Total elements are:" + " " + count);
    }
}