import java.util.Scanner;
class Divisible{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        System.out.println("Enter a Number ");
        int num = sc.nextInt();

        if((num%5==0)&&(num%11==0)){
            System.out.println("This Number is Divisble by 5 & 11 ");
        }else{
            System.out.println("This Number is NOt Divisble by 5 & 11");
        }
    }
}