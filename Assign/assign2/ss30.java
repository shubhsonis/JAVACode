import java.util.Scanner;
 
class EvenorOdd1{
 
    public static void main(String []args )    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a number to check even or odd");
        int number=in.nextInt();
 
        if((number / 2)*2==number){
            System.out.println(+number+" is Even number");
        }else{
            System.out.println(+number+" is Odd Number");
        }
     
    }
}   
 
  
