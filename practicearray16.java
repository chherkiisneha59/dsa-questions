public class practicearray16 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        if (arr.length > 1) {
            int last = arr[arr.length - 1];

            // Traverse backward to shift elements to the right
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }

        // Print the full array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}