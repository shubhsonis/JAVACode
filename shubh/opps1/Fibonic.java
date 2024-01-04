// 8)	WAP to print Fibonacci series.

import java.util.Scanner;

class P8{
    public void Fibonic(){
        System.out.print("Enter a number :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t1 = -1;
        int t2 = 1;
        int nextterm = t1 + t2;
        
        int i = 0;
        while (i <= n) {
            System.out.println(nextterm);
            t1 = t2;
            t2 = nextterm;
            nextterm = t1 + t2;
            i++;
        }
    }

    public static void main(String[] args) {
        P8 obj = new P8();
        obj.Fibonic();
    }
}


 