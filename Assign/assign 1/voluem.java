import java.util.Scanner;

class Vol {
   public static void main(String args[]) {

      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the radius:");
      int r = sc.nextInt();
      System.out.println("Enter the height:");
      int h = sc.nextInt();

      double volume = ((22 * r * r * h) / 7);

      System.out.println("Volume of Cylinder is: " + volume);

   }
}
