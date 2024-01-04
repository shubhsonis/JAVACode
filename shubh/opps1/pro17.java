// 17)	1 	2	 4	 7	 11	 16 	…… n terms
import java.util.Scanner;
class P17{
    public void series3(int n){
        
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int n = sc.nextInt();
        P17 obj = new P17();
        obj.series3(n);
    }
}