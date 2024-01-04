//12)	WAP to print Odd numbers upto N.

import java.util.Scanner;
class P12{
    public void Odd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        for(int i=0; i<=n; i++){
            if(i%2!=0){
                System.out.println("This is Odd Number = "+i);
            }
        }
    }

    public static void main(String[] args) {
        P12 obj = new P12();
        obj.Odd();
    }
}
