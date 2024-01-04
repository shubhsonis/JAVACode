// 35)	WAP to count number of digits
import java.util.Scanner;
class P35{
    public void cou(int n){
        int count = 0;
        for(int i=1; i<=n; i++){
            count = count+i;
        }
        System.out.print("Result = " +count);
    }
}
class pro35{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number ");
        int n = sc.nextInt();
        P35 obj = new P35();
        obj.cou(n);
    }
}