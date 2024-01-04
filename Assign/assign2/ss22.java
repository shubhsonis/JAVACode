import java.util.Scanner;
class Greater{
    public static void main(String[] args){
    Scanner sc= new Scanner (System.in);

    System.out.println("Enter 1st Value");
    int x = sc.nextInt();
    System.out.println("Enter 2nd Value");
    int y = sc.nextInt();
    if(x>y){
        System.out.println("1st Value is Greater");
    }else{
        System.out.println("2nd Value is Greater");
    }
    }
}


