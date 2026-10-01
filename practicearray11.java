public class practicearray11 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
