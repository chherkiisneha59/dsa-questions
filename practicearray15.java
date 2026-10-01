public class practicearray15 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        if (arr.length > 1) {
            int first = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = first;

        }
        System.out.print("Elements after left rotation:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}