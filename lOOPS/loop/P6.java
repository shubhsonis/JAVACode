import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for (int i = 2; i > 1; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n = n / i;
            }

        }
    }
}
