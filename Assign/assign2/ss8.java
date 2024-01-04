import java.util.Scanner;
class Medical{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Do you have medical cause");
    char y = sc.next().charAt(0);
    if(y=='Y'||y=='y'){
        System.out.println("Allowed in class");
    }else{
        System.out.println("Not Allowed in class");
    }
    }
}