import java.util.Scanner;

public class Pattern92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  a  number ");
        int n = sc.nextInt();
        int sp, i, c = 1;
        for (i = 0; i <= n; i++) {
            for (sp = 1; sp <= n - i; sp++) {
                System.out.println(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == 0) {
                    c = 1;
                } else
                    c = c * (i - j + 1) / j;
                System.out.println(c + " ");
            }
            System.out.println();
        }
    }
}
