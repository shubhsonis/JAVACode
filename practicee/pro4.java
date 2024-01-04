import java.util.Scanner;
class Factorial{
    public void fact(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println("Factorial is = " +fact);
    }

}
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number ");
        int n = sc.nextInt();

        Factorial obj = new Factorial();
        obj.fact(n);
    }
}