// 24)	0	4	16	36	64	….. 1 2 3 4 5 6 7 8
import java.util.Scanner;
class P24{
    public void series7(int n){
        for(int i=0; i<=n*2-1; i++){
            if(i%2==0){
                int square = i*i;
                System.out.print(" " +square+ "");
            }
        }
    }
}
class pro24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number =");
        int n = sc.nextInt();

        P24 obj = new P24();
        obj.series7(n);
    }
}