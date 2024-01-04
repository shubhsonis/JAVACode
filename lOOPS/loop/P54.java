// 54)	WAP to print all the even numbers between two entered numbers

import java.util.Scanner;

public class P54 {
    public static void main(String[] args) {
        System.out.println("Enter 1st number : ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number : ");

        int n2 = sc.nextInt();

        for (int i = n1; i <= n2; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even ");
            }
        }
    }
}
