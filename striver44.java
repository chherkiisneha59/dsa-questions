public class striver44 {

    static void palindromei(int n) {
        int original = n;
        int rev = 0;

        for (int i = n; i != 0; i = i / 10) {
            int result = i % 10;
            rev = rev * 10 + result;
        }
        if (original == rev) {
            System.out.println("The number is palindrome");

        } else {
            System.out.println("The number is not palindrome");
        }
    }

    public static void main(String[] args) {
        palindromei(12321);
        palindromei(1234);
    }
}