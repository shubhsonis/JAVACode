//27)	*	#	*	#	*	#	*	#	*	…….

import java.util.Scanner;
class P27{
    public void series10(int n){
        for(int i=1; i<=n; i++){
            if(i%2==0){
                System.out.print(" "+"#"+" ");
            }
            else{
                System.out.print(" "+"*"+" ");
            }
        }
    }
}
class pro27{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number = ");
        int n = sc.nextInt();
        P27 obj = new P27();
        obj.series10(n);
    }
}