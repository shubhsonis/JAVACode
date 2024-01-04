import java.util.Scanner; 
   class Vot{ 
     public static void main(String[] args) { 
     Scanner sc= new Scanner(System.in); 

     System.out.println("Enter your age : ");
     int age=sc.nextInt();
     
     if(age>=18){
             System.out.println("You are eligible for vote" );
     }
     else{
          System.out.println(" You are not Eligible for vote");
     } 
      
     
     } 
} 
