public class practicearray18 {
    public static void main(String[] args) {
        int[] arr = { 20, 10, 90, 80 };
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("The largest element in the array is: " + largest);  
    }
}