import java.util.Scanner;

interface Shape {
    void area();
}

class Rectangle implements Shape {
    private float length, breadth;

    public Rectangle(float l, float b) {
        length = l;
        breadth = b;
    }

    public Rectangle() {
    }

    public void area() {
        System.out.println(length * breadth);
    }
}

class Circle implements Shape {
    private float radius;

    public Circle(float r) {
        radius = r;
    }

    public Circle() {
    }

    public void area() {
        System.out.println(3.14 * radius * radius);
    }

}

class Shape1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Redius of Circle ");
        float radius = sc.nextFloat();

        System.out.println("Enter Length : ");
        float length = sc.nextFloat();

        System.out.println("Enter Breadth : ");
        float breadth = sc.nextFloat();

        Shape r = new Rectangle(length, breadth);
        Shape c = new Circle(radius);

        c.area();
        r.area();
    }
}
