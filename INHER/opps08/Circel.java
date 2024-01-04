import java.util.Scanner;

public class Circel {
    private float radius;

    Circel(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public double Area() {
        double area = 3.14 * (radius * radius);
        return area;
    }

    public double Circumference() {
        double c = 2 * 3.14 * radius;
        return c;
    }

}

class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Radius : ");
        float radius = sc.nextFloat();

        Circel obj = new Circel(radius);

        System.out.println("Area of radius " + radius + " : " + obj.Area());
        // System.out.println(obj.getRadius());

        System.out.println("Enter again radius");
        radius = sc.nextFloat();

        obj.setRadius(radius);
        System.out.println("Area of " + obj.getRadius() + " : " + obj.Area());
        System.out.println("Circumference of Radius " + obj.getRadius() + " : " + obj.Circumference());
    }
}
