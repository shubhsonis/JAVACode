// 17)	1 	2	 4	 7	 11	 16 	…… n terms

import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        int firstdigit = 1;
        int secondigit = 2;
        int nextterm = secondigit + i;
        int s = nextterm;
        System.out.print(firstdigit + " ");
        System.out.print(secondigit + " ");
        System.out.print(nextterm + " ");

        for (i = 3; i <= n; i++) {
            s = s + i;
            System.out.print(s + " ");

        }
    }
}
