import java.util.Scanner;
class Primeornot{
    public void Number(int n){
        boolean flag = false;
        int i;
        for(i=2; i<=n/2; i++){
            if(n%i==0){
                flag = true;
                break;
            }
        }
        if(i>n/2 && n!=0)
        Sytem.out.println("This is a prime number ");
        else
        Sytem.out.println("This is not a prime number ");
    }
}
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number ");
        int n = sc.nextInt();

        Primeornot obj = new Primeornot();
        obj.Number(n);
    }
}