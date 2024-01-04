import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        int k = n;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (j >= (n + 1) - i) {

                    System.out.print((n+1)-i);

                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
            k--;
        }

    }
}
