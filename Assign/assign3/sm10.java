// area of isosceles Tringle = (1*b*h)/2
import java.util.Scanner;
class A10{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter a Higth ");
    int h = sc.nextInt();
    System.out.println("Enter a Base ");
    int b = sc.nextInt();
    int sides = 15;
    float z = (1*b*h)/2;
    System.out.println("Area of Isosceles : " +z);
    }

}