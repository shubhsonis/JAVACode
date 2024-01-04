// 13)	WAP to print N natural numbers in reverse order

import java.util.*;

public class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int rev = 0, rem = 0;
        // int r;

        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;

        }
        System.out.println("Reverse is : " + rev);

    }

}
