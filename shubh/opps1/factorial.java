//WAP to find out the factorial of a number.
import java.util.Scanner;

class p5{
    public int fact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact = (fact * i);
            i++;
        }
        return fact;
        //System.out.println("Factorial is : " + fact);
    }

    public static void main(String[] args) {
        p5 obj = new p5();
        int a = obj.fact();
        System.out.println(a);
    }
}
