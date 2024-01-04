//Q.21 = 1,	4,	9,	16,	25	…..
import java.util.Scanner;
class P21{
    public void series4(int n){
        for(int i=1; i<=n; i++){
            int square = i*i;
            System.out.print(" " +square+ " ");
        }
    }
}
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number :- ");
        int n = sc.nextInt();

        P21 obj = new P21();
        obj.series4(n);
    }
}
    
