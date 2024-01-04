
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a String");
            String s = sc.next();
            System.out.println("5th : " +s.charAt(5));

            System.out.println("Enter 2 Integer No : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a/b;
            System.out.println("Result : " +c);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Invalide :");
        }
        catch(InputMismatchException e){
            System.out.println("Please Integer number ");
        }
        catch(ArithmeticException e){
            System.out.println("Number Dose not Divide by :");
        }
    }
}
