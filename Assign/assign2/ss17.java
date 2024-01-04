import java.util.Scanner;
class Rectangle{
    public static void main(String[] args){
    Scanner sc= new Scanner (System.in);

    System.out.println("Enter Value of Length");
    float length = sc.nextFloat();
    System.out.println("Enter Value of Width");
    float width = sc.nextFloat();
    float Aor = width*length;
    System.out.println("The Value of Area of Rectangle = " +Aor);
    }
}    