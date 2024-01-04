 import java.util.Scanner;
class Ele{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Units ");
        int unit = sc.nextInt();

        if(unit>1 && unit<=100){
            unit = unit*10;
            System.out.println("Amount = "+unit);
        }
        else if(unit>100 && unit<=200){
            unit = unit*15;
            System.out.println("Amount = "+unit);
        }
        else if(unit>200 && unit<=300){
            unit = unit*20;
            System.out.println("Amount ="+unit);
        }
        else{
            unit = unit*30;
            System.out.println("Amount = "+unit);
        }
    }
}
