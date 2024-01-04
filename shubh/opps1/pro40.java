// 40)	WAP to count no. Of even and odd digits in a number
import java.util.Scanner;
class P40{
    public void evenodd(int n){
        int rem = 0, ecount = 0, ocount = 0;
        while (n!=0) {
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

class pro40{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number ");
        int n = sc.nextInt();

        P40 obj = new P40();
        obj.evenodd(n);
    }
}
    
