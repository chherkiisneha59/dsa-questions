public class striver43 {

    static void reverses(String s) {
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        reverses("hello");
    }
}