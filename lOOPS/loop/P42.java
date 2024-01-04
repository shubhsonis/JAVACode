// 42)	WAP to find out HCF of a number

import java.util.Scanner;

public class P42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d=1;
        int i;
       for( i=1;i<=a && i<=b;i++){
        if (a % i == 0 && b % i == 0) {
            d = i;
        }
       }
       System.out.println(d);
       
   }
}