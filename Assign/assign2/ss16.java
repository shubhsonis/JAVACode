import java.util.Scanner;
class Circle{
    public static void main(String[] args){
    Scanner sc= new Scanner (System.in);

    System.out.println("Enter Value of pi");
    float pi = sc.nextFloat();
    System.out.println("Enter of Redius Value");
    float r = sc.nextFloat();

    float Area = (pi)*r*r;
    System.out.println("Value of Area = " +Area);
    }
}