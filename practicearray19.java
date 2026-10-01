public class practicearray19 {
    public static void main(String[] args) {
        int[] arr = { 10, 90, 70, 60, 80 };
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondsmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondsmallest && arr[i] > smallest) {
                secondsmallest = arr[i];
            }
        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + secondsmallest);
    }
}