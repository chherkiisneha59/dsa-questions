public class striver33 {

    static void divi(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Divisible by both 3 and 5");
        } else {
            System.out.println("Not divisible");
        }
    }

    public static void main(String[] args) {
        divi(15);
        divi(9);
    }
}