public class striver42 {

    static void reversei(int n) {
        int rev = 0;

        for (int i = n; i != 0; i = i / 10) {
            int result = i % 10;
            rev = rev * 10 + result;
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        reversei(1234);
    }
}