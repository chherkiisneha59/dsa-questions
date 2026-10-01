public class striver29 {

    static void checker(int n) {
        if (n >= 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("0");
        }
    }

    public static void main(String[] args) {
        checker(-5);
        checker(4);
        checker(0);
    }
}