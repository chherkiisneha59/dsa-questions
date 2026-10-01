import java.util.Arrays;

public class practicearray17 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 10 };
        int[] Arr = arr.clone(); // Create a copy of the original array

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        if (Arrays.equals(arr, Arr)) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
    }
}