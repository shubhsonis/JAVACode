//46)	WAP to find out the sum of first and last digit of a user entered number 


import java.util.Scanner;

public class P46 {
    public static void main(String[] args) {
        System.out.println("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int last=n%10;
       int rem;
       while(n>9){
        rem=n%10;
        n=n/10;
       }
       int first=n;
       int sum=last+first;
        System.out.println("Sum = " + sum);
    }

}
