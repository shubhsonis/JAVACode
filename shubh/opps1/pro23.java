//23)	1	9	25	49	81	…..
import java.util.Scanner;
class P23{
    public void series6(int n){
        for(int i=1; i<=n*2; i+=2){
           // if(i%2==1){
            int square = i*i;
            System.out.print(" " +square+ " ");
          //  }
        }
    }
}
class pro23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        P23 obj = new P23();
        obj.series6(n);
    }
}

