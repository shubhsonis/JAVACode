// 20)	0	7	14	21	28	35	…..
import java.util.Scanner;
class P20{
    public void series4(int n){
        
    
        int i = 0;
        System.out.print(i + " ");
        int x = 7;
        for (x = 1; x <= n; x++) {
            int y = 7;
            System.out.print(y * x + " ");
    }
}
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        P20 obj = new P20();
        obj.series4(n);

    }
}