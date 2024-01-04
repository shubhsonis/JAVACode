// 56)	WAP to print factorial of all the numbers between two entered numbers

import java.util.Scanner;

public class P56 {
   public static void main(String[] args) {

      System.out.println("Enter 1st number : ");
      Scanner sc = new Scanner(System.in);
      double n1 = sc.nextDouble();
      System.out.println("Enter 2nd number : ");

      double n2 = sc.nextDouble();

      for (double i = n1; i <= n2; i++) {
         double fact = 1;
         for (double j = 1; j <= i; j++) {
            fact = fact * j;
         }
         System.out.println(fact);
      }
   }

}
