//45)	WAP to find out the sum of all the digits of a number

import java.util.Scanner;

public class P45 {
    public static void main(String[] args) {
        System.out.println("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int rem = 0;
       // int rev = 0;
        int sum = 0;
        while(n!=0) {
            
            sum = sum + n%10;
            n = n / 10;

        }
        System.out.println("Sum = " + sum);
    }

}
