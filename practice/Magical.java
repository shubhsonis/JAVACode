import java.util.Scanner;

public class Magical {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number ");
        int number = sc.nextInt();

        int sum = 0, reminder =1;
        while (number > 9) {
            while (number > 0) {
                reminder = number % 10;
                sum += reminder;
                number /= 10;
            }
            number = sum;
            sum = 0;
        }
        if (number == 1)

        {
            System.out.println("The given number is a magic number.");
        } else {
            System.out.println("The given number is not a magic number.");
        }
    }
}
