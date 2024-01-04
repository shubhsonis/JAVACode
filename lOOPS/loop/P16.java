
// 16)	…... -6	-3	0	3	6	9	……. n terms	 
import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for (int i = n; i > 0; i -= 3) {

            System.out.print(i * -1 + "\t");

        }
        for (int j = 0; j <= n; j += 3)

        {
            System.out.print(j + "\t");
        }

    }
}
