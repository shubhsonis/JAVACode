import java.util.Scanner;
class Triangle{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a 1st Angles");
        int a = sc.nextInt();
        System.out.println("Enter a 2nd Angles");
        int b = sc.nextInt();
        System.out.println("Enter a 3rd Angles");
        int c = sc.nextInt();
        int x =  a+b+c;

        if(x==180){
            System.out.println("This Triangle is Valid");
        }else{
            System.out.println("This Triangle is Not Valid");
        }
        
    }
}