//39)	WAP to check whether entered number is strong or not
import java.util.Scanner;
class P39{
    public void strong(int n){
         int temp = n;
         int r, sum=0;

        while (n != 0) {
            r = n % 10;
            int fact = 1;
            for (int i = r; i >= 1; i--) {
                fact = fact * i;
            }
            sum = sum + fact;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("Number is Strong");
        } else {
            System.out.println("Number is Not a Strong");
        }
        System.out.println(sum);
    }
}

class pro39{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number ");
        int n = sc.nextInt();

        P39 obj = new P39();
        obj.strong(n);
    }
}
    
