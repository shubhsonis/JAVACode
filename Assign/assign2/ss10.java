import java.util.Scanner;
class Year{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter the Year");
    int x = sc.nextInt();

    if(x%4==0||x%400==0){
        System.out.println("This year is leap year");
    }else{
        System.out.println("This year is Not leap year");
    }
    }
}




