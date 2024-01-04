import java.util.Scanner;
class Studentmark{
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);

     System.out.println("Physics Marks");
     int a = sc.nextInt();
     System.out.println("Chemistry Marks");
     int b = sc.nextInt();
     System.out.println("Biology Marks");
     int c = sc.nextInt();
     System.out.println("Mathes Marks");
     int d = sc.nextInt();
     System.out.println("Computer Marks");
     int e = sc.nextInt();
     int per = (a+b+c+d+e)/5;
      
     if(per>=90){
        System.out.println("Grade A ");
     }else if(per>=80){
        System.out.println("Grade B ");
     }else if(per>=70){
        System.out.println("Grade C");
     }else if(per>=60){
        System.out.println("Grade D");
     }else if(per>=40){
        System.out.println("Grade E ");
     }else{
        System.out.println("Grade F ");
     }
    }
} 
      

     
     

     