import java.util.Scanner;
class Power{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num ");
        int num = sc.nextInt();

        int a=0, rev=0;
        while(num>0){
            a = num%10;
            rev = rev*10+a;
            num = num/10;
        }        

        System.out.print("Reverse num " +rev);
        
        for(int i=0; i<pow; i++){
            
        int pow = sc.nextInt();
        pow = num*rev;
        System.out.println(" power of number " +pow);
        }


    }
}