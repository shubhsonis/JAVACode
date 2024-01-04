// import java.util.Scanner;

// class Rectangle {
//       private float width;
//       private float height;

//       Rectangle(float width, float height) {
//             this.width = width;
//             this.height = height;
//       }

//       void areaofrectangle() {
//             System.out.println("Area of Rectangle : " + (width * height));
//       }

//       void perimeter() {
//             System.out.println("Perimeter of Rectangle : " + (2 * (width + height)));
//       }

// }

// public class O3 {
//       public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             System.out.println("Enter the width of Rectangle : ");
//             float w = sc.nextFloat();
//             System.out.println("Enter the height of Rectangle : ");
//             float h = sc.nextFloat();
//             Rectangle obj = new Rectangle(w, h);
//             obj.areaofrectangle();
//             obj.perimeter();

//       }
// }

import java.util.Scanner;
class Rectangle{
      private int width, hight;

      Rectangle(int width, int hight){
            this.width = width;
            this.hight = hight;
      }
      Rectangle(){

      }
      public int Area(){
           int area = width*hight; 
           return area;
      }
      public int Perimeter(){
            int perimeter = 2*(width+hight);
            return perimeter;
      }
}
class TestMain{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the width : ");
            int width = sc.nextInt();
            System.out.println("Enter the Hight : ");
            int hight = sc.nextInt();
      }
}