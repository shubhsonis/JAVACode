// // 13) Create a class to calculate Area of circle with one data member to store the radius and another to store area value. Create method members
import java.util.Scanner;
class AreaofCircle{
    private float radius,area, pi=3.14f;
   // private double area;
    public void setData(float radius){
        this.radius=radius;
       
    } 
    public void calArea(float radius, float pi){
        double area = pi*radius*radius;
    }
    public void display(){
        System.out.println("Area of circle =" +area);
        
    }
}
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter the radius of the circle = ");
        int radius = sc.nextInt();
       

        AreaofCircle obj = new AreaofCircle();
        obj.seData(radius);
        obj.calArea(radius);
        obj.display();
    }
}

    
    
     

    


