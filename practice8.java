public class practice8 {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 5, 8, -7, 6 };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                System.out.println("Positive" + " " + arr[i]);
            } else {
                System.out.println("Negative" + " " + arr[i]);
            }
        }
    }

}
