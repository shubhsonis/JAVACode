import java.util.Scanner;
class ProfitandLoss{
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);

     System.out.println("Enter the Cost price ");
     int x = sc.nextInt();
     System.out.println("Enter  the Selling price ");
     int y = sc.nextInt();

     if(x<y){
        int pro = y-x;
        System.out.println("profit " +pro);
     }else{
        int loss =x-y;
        System.out.println("Loss " +loss);
     }
    }
}

