public class striver48 {

    static void hello(int n) {
        int count = 0;

        for (int i = 1; i <= 10; i++) {

            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }

    public static void main(String[] args) {
        hello(4);
    }
}