// 37)	WAP to check whether entered number is palindrome or not

import java.util.Scanner;
class P37{
    public void pelindrome(int n){
        int original = n;
        int i = 1, rem = 0, rev = 0;
        while (i <= n) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;

        }
        System.out.println("Reverse : " + rev);
        if (rev == original) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not Palindrome.");
        }

    }

}

class pro37{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number ");
        int n = sc.nextInt();
        P37 obj = new P37();
        obj.pelindrome(n);

        
    }
}
