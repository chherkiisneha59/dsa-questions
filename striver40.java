
public class striver40 {

    static void counti(int n) {

        if (n == 0) {
            System.out.println(1);
            return;
        }
        int count = 0;

        for (int i = n; i != 0; i = i / 10) {
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        counti(1234);
        counti(0);
    }
}
