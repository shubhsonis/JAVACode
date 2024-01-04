// 55)	WAP to print all the odd numbers between two entered numbers

import java.util.Scanner;

public class P55 {
    public static void main(String[] args) {
        System.out.println("Enter 1st number : ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number : ");

        int n2 = sc.nextInt();
        int temp = 0, sum;
        for (int i = n1; i <= n2; i++) {
            if (i % 2 == 1) {
                System.out.println(i + " is Odd ");
            }
        }
    }
}
