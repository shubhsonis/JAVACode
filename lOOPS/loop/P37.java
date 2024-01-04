// 37)	WAP to check whether entered number is palindrome or not

import java.util.Scanner;

public class P37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int original = n;
        int i = 1, rem = 0, rev = 0;
        while (i <= n) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;

        }
        System.out.println("Reverse : " + rev);
        if (rev == original) {
            System.out.println("This Are Palindrome Number : ");
        } else {
            System.out.println("This Are Not Palindrome Number : ");
        }

    }

}
