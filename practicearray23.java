public class practicearray23 {
    public static void main(String[] args) {
        int[] arr = { 20, -10, 90, -7, 50, -86 };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
