// 25)	1	27	125	343	…………	
import java.util.Scanner;
class P25{
    public void series8(int n){
        for(int i=1; i<=n*2; i++){
            if(i%2==1){
            int square = i*i*i;
            System.out.print(" " +square+ " ");
            }
        }
    }
}
class pro25{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        P25 obj = new P25();
        obj.series8(n);
    }
}