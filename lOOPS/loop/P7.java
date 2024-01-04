// 7)	WAP to check whether entered number is prime or not.

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int i;
        for (i=2; i<=n/2; i++) {
            if (n % i == 0) {
                break;

            }
        }
        if (i>n/2)
            System.out.println("Prime number");

        else

            System.out.println("Not a Prime number.");
    }

}