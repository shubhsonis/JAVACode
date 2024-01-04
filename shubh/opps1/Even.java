// 9)	10)	WAP to print Even numbers upto N.
import java.util.Scanner;
class P9{
    public void even(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        for(int i=0; i<=n; i++){
            if(i%2==0){
                System.out.println("Even Number is = "+i);
            }
           // else{
             //   System.out.println("Not Even number ");
           // }
        }
    }

    

    public static void main(String[] args) {
        P9 obj = new P9();
        obj.even();
    }
}