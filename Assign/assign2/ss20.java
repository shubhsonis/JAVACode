import java.util.Scanner;
class Swapnum1{
    public static void main(String[] args){
    Scanner sc= new Scanner (System.in);

    System.out.println("Enter the 1st Value ");
    int x = sc.nextInt();
    System.out.println("Enter the 2nd Value ");
    int y = sc.nextInt();
      x = x+y;
      y = x-y;
      x = x-y;
    System.out.print("After Swaping 1st Value : " +x);
    System.out.print(" After Swaping 2nd Value : " +y);
    
    }
}        
    
  
