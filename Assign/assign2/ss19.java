import java.util.Scanner;
class Swapnum{
    public static void main(String[] args){
    Scanner sc= new Scanner (System.in);

    System.out.println("Enter the 1st Value ");
    int x = sc.nextInt();
    System.out.println("Enter the 2nd Value ");
    int y = sc.nextInt();
    int z = x;
        x = y;
        y = z;
    System.out.print("After Swaping 1st Value : " +x);
    
    System.out.print(" After Swaping 2nd Value : " +y);
    }
}        
