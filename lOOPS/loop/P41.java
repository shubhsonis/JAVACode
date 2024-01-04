// 41)	WAP to find out LCM of a number

import java.util.Scanner;

public class P41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = (a > b) ? a : b;
        while (true) {
            if (max % a == 0 && max % b == 0) {
                System.out.println(max);
                break;
            }
            ++max;
        }

    }
}
