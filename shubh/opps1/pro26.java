// 26)	0	8	64	216	…………

import java.util.Scanner;
class P26{
    public void series9(int n){
        for(int i=0; i<=n*2-1; i++){
            if(i%2==0){
                int square = i*i*i;
                System.out.print(" " +square+ "");
            }
        }
    }
}
class pro26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number =");
        int n = sc.nextInt();

        P26 obj = new P26();
        obj.series9(n);
    }
}