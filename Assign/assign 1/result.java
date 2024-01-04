import java.util.Scanner;

class Result {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Hindi : ");
    byte a = sc.nextByte();

    System.out.println("English : ");
    byte b = sc.nextByte();

    System.out.println("computer : ");
    byte c = sc.nextByte();

    System.out.println("Science : ");
    byte d = sc.nextByte();

    System.out.println("Maths : ");
    byte e = sc.nextByte();

    int x = (a + b + c + d + e);
    System.out.println("Total mark :" + x);

    double y = (x / 5);
    System.out.println("Total per :" + y);

    int f = 60, g = 50, h = 33;

    String z = (y > f) ? " pass first division "
        : (y > g) ? " pass second division " : (y > h) ? " third division " : "failed";
    System.out.println("Result = " + z);

  }

}
