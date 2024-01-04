import java.util.Scanner;
class Gre{
    public static void main(String[] args){
    Scanner sc =  new Scanner(System.in);
    
    System.out.println("Enter  the 1st NO.");
     byte a = sc.nextByte();
    System.out.println("Enter the 2nd NO.");
     byte b = sc.nextByte();
     
    System.out.println((a==b)?"both no.are equal":(a>b)? "1st No.is Greater":"2nd No.is Greater");

     
    }
 


}