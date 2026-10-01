public class striver46 {

    static void hello(int a, int b) {
        int LCM;
        if (a > b) {
            LCM = a;
        } else {
            LCM = b;
        }

        while (true) {
            if (LCM % a == 0 && LCM % b == 0) {
                System.out.println(LCM);

                break;

            }
            LCM++;

        }
    }

    public static void main(String[] args) {
        hello(3, 4);
    }
}