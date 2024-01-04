// 49)	WAP to find out all the perfect numbers between two entered numbers


import java.util.Scanner;

public class P49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number : ");
        int n1 = sc.nextInt();

        System.out.println("Enter 2nd number : ");
        int n2 = sc.nextInt();

        int temp = 0, sum;
        for (int i = n1; i <= n2; i++) {
            temp = i;
            sum = 0;
            for (int j = 1; j <= temp / 2; j++) {
                if (i % j == 0) {
                    sum = sum + j;

                }

            }
            if (sum == i) {
                System.out.println(sum +" "+"Is The Perfect Number Between Two Numbers");
            }
        }
    }
}
