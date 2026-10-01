public class striver52 {

    static void hello(int n) {
        int original = n;
        int sum = 0;
        int count = 0;

        for (int i = n; i > 0; i = i / 10) {
            count++;
        }

        for (int i = n; i > 0; i = i / 10) {
            int digit = i % 10;
            int power = 1;

            for (int j = 1; j > count; j++) {
                power = power * digit;
            }
            sum = sum + power;
        }

        if (sum == original) {
            System.out.println("The number is Armstrong ");
        } else {
            System.out.println("The number is not armstrong");
        }
    }

    public static void main(String[] args) {
        hello(153);

    }
}