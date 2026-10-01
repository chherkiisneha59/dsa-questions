public class striver45 {

    static void palindromes(String s) {
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        if (s.equals(rev)) {
            System.out.println("This string is palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    public static void main(String[] args) {
        palindromes("Ana");
        palindromes("4334");
    }
}