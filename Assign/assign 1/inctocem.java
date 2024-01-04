import java.util.Scanner;
class Itc{
    public static void main(String[] args){
    Scanner sc =  new Scanner(System.in);
    
    System.out.println("Enter your hight in foot =");
    double a =  sc.nextDouble();

    double b = a*12;
    System.out.println("In inch "+b);
    

    double cm = (b*2.54);
    
    System.out.println("Result is CM "+cm);
    
    }
}    
