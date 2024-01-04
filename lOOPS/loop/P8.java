// 
//WAP to print Fibonacci series.

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t1 = -1;
        int t2 = 1;
        int nextterm = 0;
        //System.out.println(t1);
        //System.out.println(t2);

        int i = 0;
        while (i <= n) {
            System.out.println(nextterm);
            t1 = t2;
            t2 = nextterm;
            nextterm = t1 + t2;
            i++;
            
        }
    }
}
