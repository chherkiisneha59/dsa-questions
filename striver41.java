public class striver41 {

    static void counts(String s) {

        int count = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        counts("Hello");
    }
}