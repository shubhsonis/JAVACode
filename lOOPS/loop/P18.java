//18)	1	2	2	4	8	32	…… n terms

import java.util.Scanner;

public class P18 {

    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int b = 2;
        System.out.print(a + " " + b);
        for (int i = 1; i <= n - 2; i++) {
            int temp = a * b;
            System.out.print(" " + temp);
            a = b;
            b = temp;

        }
    }
}

