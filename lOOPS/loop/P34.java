//  34)	WAP to check whether entered number is perfect or not

import java.util.Scanner;

public class P34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        int c = n;
        for (int i = 1; i < n; i++) {
            while (n % i == 0) {
                sum = sum + i;
                i++;
            }

        }
        if (sum == c) {
            System.out.println("Perfect number.");
        } else {
            System.out.println("Not a perfect number.");
        }
    }
}
