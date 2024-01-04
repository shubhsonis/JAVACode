import java.util.Scanner;
class Tring{
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
       
        System.out.println("Enter 1st side");
        int x = sc.nextInt();
        System.out.println("Enter 2nd side");
        int y = sc.nextInt();
        System.out.println("Enter 3rd side");
        int z = sc.nextInt();

        if((x==y)&&(y==z)){
            System.out.println("The traingle is equilateral");
        }else if(y==z){
            System.out.println("The traingle is scalene");
        }else{
            System.out.println("The traingle is isosceles");
        }
    } 
}       