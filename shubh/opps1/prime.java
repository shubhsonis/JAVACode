import java.util.Scanner;

class p7 {
    public void prime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int i;
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                break;

            }
        }
        if (i > n / 2)
            System.out.println("Prime number");

        else

            System.out.println("Not a Prime number.");
    }


    public static void main(String[] args) {
         p7 obj = new p7();
         obj.prime();
    }
}