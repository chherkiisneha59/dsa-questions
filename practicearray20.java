public class practicearray20 {
    public static void main(String[] args) {
        int[] arr = { 10, 10, 10, 10 };
        boolean allEqual = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                allEqual = false;
                break;
            }
        }
        if (allEqual) {
            System.out.println("All elements are equal");
        } else {
            System.out.println("All elements are not equal");
        }
    }
}
