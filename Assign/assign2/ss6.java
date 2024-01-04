import java.util.Scanner;
class Abs{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter a Number");
    int a = sc.nextInt();

    if(a>0){
        System.out.println("Output "+a);
    }else{
        System.out.println("Output "+(-(a)));
    }
    }
}
