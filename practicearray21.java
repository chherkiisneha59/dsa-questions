public class practicearray21 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        int difference = largest - smallest;
        System.out.println("The difference between the largest and smallest elements in the array is: " + difference);
    }
}
