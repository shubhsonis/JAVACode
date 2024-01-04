// 39)	WAP to check whether entered number is strong or not

import java.util.Scanner;

public class P39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, sum = 0;
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int temp = n;

        while (n != 0) {
            r = n % 10;
            int fact = 1;
            for (int i = r; i >= 1; i--) {
                fact = fact * i;
            }
            sum = sum + fact;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("Number is Strong");
        } else {
            System.out.println("Number is Not a Strong");
        }
        System.out.println(sum);
    }
}
