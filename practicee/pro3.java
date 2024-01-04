//Armstrong NUmber.
import java.util.Scanner; 
class Armstrong{
    public static void main(String args[]){
        int a, rem, arm = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
         a=n;
        while(n>0){
            rem=n%10;
            arm = (rem*rem*rem)+arm;
            n = n/10;
        }
        if(a==arm){
            System.out.println("Armstrong Number ");
        }else{
            System.out.println("Not Armstrong Number ");
        }

    }
}