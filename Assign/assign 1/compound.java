import java.util.Scanner;

class Compound {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print(" Enter the principal Number : ");
      double p = sc.nextDouble();

      System.out.print(" Enter the Interest Number : ");
      double r = sc.nextDouble();

      System.out.print(" Enter the Time period : ");
      double t = sc.nextDouble();

      double a = p * (1 + r / 100) * t;
      System.out.println("Value of a = " + a);
      double compoundinterest = (a - p);
      System.out.println("Result of compound interest = " + compoundinterest);

   }
}
