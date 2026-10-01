public class striver47 {

    static void hello(int a, int b) {
        int hcf;

        if (a < b) {
            hcf = a;
        } else {
            hcf = b;
        }

        for (int i = hcf; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
                System.out.println(hcf);
                break;
            }
        }
    }

    public static void main(String[] args) {
        hello(9, 10);
        hello(4, 6);
    }
}