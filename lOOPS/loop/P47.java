// 47)	WAP to print tables of all the numbers between two entered numbers
import java.util.Scanner;

public class P47 {
    public static void main(String[] args) {
        System.out.println("Enter 1st number : ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number : ");

        int n2 = sc.nextInt();
        int temp = 1;
        for (int i = n1; i <= n2; i++) {
            for (int j = 1; j <= 10; j++) {
                temp = i * j;
                 System.out.print(temp+"  ");
            }
           System.out.println();
        }
    }

}
