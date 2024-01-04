// 38)	WAP to check whether entered number is Armstrong or not

import java.util.Scanner;

public class P38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int original = n;
        int i = 1, rem = 0, sum = 0;

        while (i <= n) {
            rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;
        }
        if (sum == original) {
            System.out.println("Armstrong.");
        } else {
            System.out.println("Not Armstrong.");
        }

    }

}
