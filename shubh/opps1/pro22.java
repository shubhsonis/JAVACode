//Q.22)	1	8	27	64	125	…..
import java.util.Scanner;
class P22{
    public void series5(int n){
        for(int i=1; i<=n; i++){
            int cube = i*i*i;
            System.out.print(" " +cube+ " ");
        }
    }
}
            
class pro22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a NUmber :- ");
        int n = sc.nextInt();
        P22 obj = new P22();
        obj.series5(n);
    }
}