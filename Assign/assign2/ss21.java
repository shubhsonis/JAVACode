import java.util.Scanner;
class Swapnum2{
    public static void main(String[] args){
    Scanner sc= new Scanner (System.in);

    System.out.println("Enter the 1st Value ");
    int x = sc.nextInt();
    System.out.println("Enter the 2nd Value ");
    int y = sc.nextInt();
     x = x^y;
     y = x^y;
     x = x^y;
    System.out.println("After Swaping 1st num " +x); 
    System.out.println("After Swaping 2nd num " +y); 
    
    }
}    