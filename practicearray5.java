import java.util.Scanner;

public class practicearray5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];

        // Taking input from user
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int smallest = arr[0];
        // logic for smallest element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        // Printing the smallest element
        System.out.println("Smallest element is: " + smallest);

    }
}