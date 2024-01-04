// 22)	1	8	27	64	125	…..
import java.util.Scanner;

public class P22 {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int s = i * i * i;
            System.out.print(s + " ");
        }

    }
}
