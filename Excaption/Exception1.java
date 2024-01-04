import java.util.Scanner;
import java.util.InputMismatchException;

public class Exception1 {
    public static void main(String[] args) {
        boolean flag = false;
        while (!flag) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("Enter a 1st Number");
                int x = sc.nextInt();

                System.out.println("Enter a 2nd Number");
                int y = sc.nextInt();

                int z = x / y;
                flag = true;

                System.out.println("Division : " + z);

                System.out.println("At The End Of ");
            } catch (ArithmeticException obj) {
                System.out.println("Number does not divided by");
            } catch (InputMismatchException obj) {
                System.out.println("Please Enter Integer Number ");
            }

        }
    }
}
