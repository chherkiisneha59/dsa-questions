public class striver32 {

    static void lpyr(int n) {

        if (n % 4 == 0 && n % 100 != 0) {
            System.out.println("Leap Year");
        } else if (n % 400 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }

    public static void main(String[] args) {
        lpyr(2024);
        lpyr(1997);
    }
}