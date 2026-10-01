public class practicearray9 {
    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30, 40, 50 };
        int[] arr2 = new int[arr1.length];

        // copy elements of arr1 to arr2
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.print("Copied elements from arr1 to arr2:" + " ");
        // print elements of arr2
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
