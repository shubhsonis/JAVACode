import java.util.Scanner;

public class P32 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int n = sc.nextInt();
    int u = 65, l = 97;
    for (int i = 1; i <= n * 2; i++) {
      if (i % 2 == 0) {
        System.out.print((char) (u + 32) + " ");
        u++;
      } else if (i % 2 != 0) {
        System.out.print((char) (l - 32) + " ");
        l++;
      }
    }
  }

}
