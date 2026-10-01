import java.util.Scanner;

public class practicearray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;

        System.out.print("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Sum for array is:");
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.print(sum);
    }

}
