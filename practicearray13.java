public class practicearray13 {
    public static void main(String[] args) {
        int[] arr = { 3, 8, 12, 8, 17, 5, 8 };
        int target = 8;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        System.out.println("The number " + target + " appears " + count + " times in the array.");
    }
}
