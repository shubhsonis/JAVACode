import java.util.Scanner;

class Circle {
      private float radius;

      Circle(float radius) {
            this.radius = radius;
      }
    
 
        void setRadius(float radius){
            this.radius=radius;
      }
      void aoc() {
            System.out.println("Area of Circle : " + (22 / 7f * radius * radius));
      }

      void coc() {
            System.out.println("Circumference of circle : " + (2 * 22 / 7f * radius));
      }

}

public class O4 {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter radius : ");
            float r = sc.nextFloat();
            Circle obj = new Circle(r);
            obj.aoc();
            obj.coc();

            System.out.println("Do you want to change the radius Press 'yes' otherwise press 'no': ");
            String choice = sc.next();
            if (choice.equals("yes")) {
                  System.out.println("Enter 1 for change the radius otherwise press 2 :  ");
                  int choose = sc.nextInt();
                  switch(choose){
                        case 1: {
                          System.out.println("Enter updated radius : ");
                          float radius  = sc.nextFloat();
                          Circle obj2 = new Circle(radius);
                          obj2.aoc();
                          obj2.coc();
                          break;
                        }
                  
                        case 2 : break;
                  }


            }

      }
}
