public class practicearray12 {
    public static void main(String[] args) {
        int[] arr = { 9, 2, 35, 40, 52 };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " is even");
            } else {
                System.out.println(arr[i] + " is odd");
            }
        }
    }
}
