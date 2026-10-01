public class practicearray7 {
    public static void main(String[] args) {
        int[] arr = { 25, 19, 55, 72, 86 };
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Number of even elements: " + count);
    }

}
