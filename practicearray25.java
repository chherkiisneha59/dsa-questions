public class practicearray25 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 20, 10, 40 };

        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (duplicate) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}