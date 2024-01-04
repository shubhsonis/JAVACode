import java.util.Scanner;  
class PN1{
      
    public static void main(String[] args)   
    {  
    int num;  
     
    Scanner sc = new Scanner(System.in);  
    System.out.print("Enter a number: ");  
     
    num = sc.nextInt();  
     
    if(num>0){  
        System.out.println("The number is positive.");
    }else{
        System.out.println("The number is negative.");
    } 
    }
} 