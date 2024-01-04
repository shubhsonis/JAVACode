// 18)	1	2	2	4	8	32	…… n terms

import java.util.Scanner;

class P18{
    public void series2(int n){
        
       int a = 1;
        int b = 2;
        System.out.print(a + " " + b);
        for (int i = 1; i <= n - 2; i++) {
            int temp = a * b;
            System.out.print(" " + temp);
            a = b;
            b = temp;
        }
    } 
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int n = sc.nextInt();

        P18 obj = new P18();
        obj.series2(n);
    }
}
      