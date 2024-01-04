// 59)	WAP to find out the sum of all integer between 100 and 200 which are divisible by 9

import java.util.Scanner;

public class P59 {
    public static void main(String[] args) {
        int temp = 0;
        int sum = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 9 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum : " + sum);

    }
}
