
// 40)	WAP to count no. Of even and odd digits in a number

import java.util.Scanner;

public class P40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int rem = 0, ecount = 0, ocount = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                rem = n % 10;
                ecount++;
            } else {
                ocount++;
            }
            n = n / 10;
        }

        System.out.println("Total number of even digits: " + ecount);
        System.out.println("Total number of odd digits: " + ocount);
    }

}
