// 34)	WAP to check whether entered number is perfect or not
import java.util.Scanner;
class P34{
    public void perfect(int n){
                int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            while (n%i == 0) {
                sum = sum + i;
                i++;
            }

        }
        if (sum == n) {
            System.out.println("Perfect number.");
        } else {
            System.out.println("Not a perfect number.");
        }
    }
}
class pro34{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number :- ");
        int n = sc.nextInt();

        P34 obj = new P34();
        obj.perfect(n);
    }
}
    
