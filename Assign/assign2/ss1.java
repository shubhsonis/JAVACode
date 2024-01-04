import java.util.Scanner;
class Rectangle{
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   
   System.out.println("value of lenght");
   int x = sc.nextInt();
   System.out.println("value of breadth");
   int y = sc.nextInt();
   if(x==y)
      System.out.println("Square...");
   else
      System.out.println("Not a Square...");
 
   }  

}
  
