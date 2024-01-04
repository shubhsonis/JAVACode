import java.util.Scanner;

class Cal {
    public static void main(String[] args){
    Scanner sc =  new Scanner(System.in);

    System.out.println("Enter Day's :");
    double days = sc.nextInt();

    double week =  days/7;
    System.out.println("Weeks : "+week);

    double months = days/30;
    System.out.println("Month : "+months);
    }
}
