// 57)	WAP to print all the prime numbers between two entered numbers

import java.util.Scanner;

public class P57 {
    public static void main(String[] args) {

        System.out.println("Enter 1st number : ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int n2 = sc.nextInt();
        int i = n1;
        int j = 2;
        for (i = n1; i <= n2; i++) {
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j > i / 2 && i > 1) {
                System.out.println(i);
            }
        }

    }
}
