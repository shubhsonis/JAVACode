// 29)	1	11	111	1111	  11111	……
import java.util.Scanner;
class P29{
    public void series12(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("1");
            }
            System.out.print("\t");
        }
    }
}

class pro29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number ");
        int n = sc.nextInt();

        P29 obj = new P29();
        obj.series12(n);
    }
}