import java.util.Scanner;

public class primenumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int count = 0;

    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        count = count + 1;
      }
    }
    if (count == 2) {
      System.out.print("Prime Number ");
    } else {
      System.out.println("Composite Number");
    }

  }
}
