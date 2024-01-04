import java.util.Scanner;

class reverse{
    public void rev(int n){
        int sum= 0, mod=0;
        while(n!=0){
            mod = n%10;
            sum = sum*10+mod;
            n = n/10;
           // System.out.print(sum+);
        }
        System.out.print(sum);
    }
}
class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number");
        int n = sc.nextInt();

        reverse obj = new reverse();
        obj.rev(n);
    }
}  
        
    
