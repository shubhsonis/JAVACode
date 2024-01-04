import java.util.Scanner;
class InvalidVoterException extends Exception{
    InvalidVoterException(){
    super("You can't elegiable for Voting ");
    }
}
class Main{
    public static void main(String[] args) {
       try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age ");
        int age = sc.nextInt();

        if(age<18){
            throw new InvalidVoterException();
        }else
                System.out.println("THANK YOU FOR VOTE");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("At the End");
 
    }
}

// class Negativenumber extends Exception {
//     Negativenumber() {
//         super("Insuffi");
//     }
// }
// class main{

// }

