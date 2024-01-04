// 50)	WAP to find out all the palindrome numbers between two entered numbers

import java.util.Scanner;

public class P50 {
    public static void main(String[] args) {
        System.out.println("Enter 1st number : ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int n2 = sc.nextInt();

        int temp = 0, sum;
        int rem;
        for (int i = n1; i <= n2; i++) {
            temp = i;
            sum = 0;
            while (temp != 0) {
                rem = temp % 10;
                sum = sum * 10 + rem;
                temp = temp / 10;
            }
            if (sum == i) {
                System.out.println(sum + " is Palindrome ");
            }
        }
    }
}
