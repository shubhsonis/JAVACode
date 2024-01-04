// 19)	1	+	1/2	+	1/3	+	1/4	+	1/5	….. n terms(find out 
import java.util.Scanner;

public class P19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        double sum = 0;
        double r = 0;
        for (int i = 1; i <= n; i++) {
            double x = 1;
            r = x / i;
            sum = sum + r;
        }
        System.out.println(sum);
    }
}
