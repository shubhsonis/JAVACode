// public class Exception5 {

// }

//  Throw Example
import java.util.Scanner;

// class PositiveNumberException extends Exception {
//     PositiveNumberException() {
//         super("Please Enter  Positive Number ");
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         try {
//             Scanner sc = new Scanner(System.in);

//             System.out.println("Enter a Positive Number ");
//             int number = sc.nextInt();
//             if (number < 0) {
//                 throw new PositiveNumberException();
//             } else
//                 System.out.println("Thanks ");
//         } catch (Exception e) {
//             e.printStackTrace();

//         }
//         System.out.println("At The End ");

//     }
// }

// Throws Example

class Balance extends Exception {
    Balance() {
        super("Insufficiant Balance ");
    }
}

class ICICI {
    public void Withdraw(int amount) throws Balance {
        if (amount > 10000) {
            throw new Balance();
        } else
            System.out.println("WithDrawal SuccessFull");
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount ");
        int amount = sc.nextInt();
    }
}