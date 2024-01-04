// 4)	WAP to print table of a number.


import java.util.Scanner;

public class P4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number for printing the table : ");
    int n = sc.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.println(n + "*" + i + "=" + (n * i));
    }

  }
}
