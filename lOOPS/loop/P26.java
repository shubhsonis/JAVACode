import java.util.Scanner;

public class P26 {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        for (int i = 0; i <= n * 2; i++) {
            if (i % 2 == 0) {
                s = i * i * i;
                System.out.print(s + " ");
            }
        }

    }
}
