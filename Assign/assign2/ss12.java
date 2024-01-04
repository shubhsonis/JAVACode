import java.util.Scanner;
class Revers{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter Value ");
    int x = sc.nextInt();

    int a = x/1000;
    int b = x%1000;
    int c = b/100;
    int d = b%100;
    int e = d/10;
    int f = d%10;

    System.out.print(f);
    System.out.print(e);
    System.out.print(c);
    System.out.print(a);
    }
}    

    

    