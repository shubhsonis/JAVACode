// 5)	WAP to find out the factorial of a number.


// import java.util.Scanner;

// public class P5 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number : ");
//         int n = sc.nextInt();
//         int fact = 1;
//         int i = 1;
//         while (i <= n) {
//             fact = (fact * i);
//             i++;
//         }
//         System.out.println("Factorial is : " + fact);
//     }
// }

import java.util.Scanner;
class Factorial{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int s = sc.nextInt();

        int fact = 1;

        for(int i=1; i<=s; i++){
            fact = (fact*i);
        }
        System.out.println("Factorial is = " +fact);
    }
}