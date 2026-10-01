public class practicearray24 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 20, 10 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("The duplicate is :" + arr[i]);
                    return;
                }
            }
        }
        System.out.println("No duplicates");
    }
}
