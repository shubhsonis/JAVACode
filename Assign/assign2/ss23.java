import java.util.Scanner;
class EvenOdd{
    public static void main(String[] args){
    Scanner sc= new Scanner (System.in);

    System.out.println("Enter a Number");
    int x = sc.nextInt();
    
    if(x%2==0){
        System.out.println(x + "  Even Number");
    }else{
        System.out.println(x + "  Odd Number");
    }
    }
}

    
