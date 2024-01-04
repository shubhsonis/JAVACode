import java.util.Scanner;
class EvenOdd2{
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter number ");
        int number = sc.nextInt();
       
      switch(number%2){
        case 0 : System.out.println("This Number is Even ");break;
        case 1 : System.out.println("This Number is Odd");break;
        case -1 :System.out.println("This Number is Odd");break;
      }
      
    }   
}