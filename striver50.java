public class striver50 {

    static void hello(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }

        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        hello(6);
    }
}