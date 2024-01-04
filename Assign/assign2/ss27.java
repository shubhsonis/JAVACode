import java.util.Scanner;
class Lowest{
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
    
        System.out.println("Enter 1st Value");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Value");
        int b = sc.nextInt();
        System.out.println("Enter 3rd Value");
        int c = sc.nextInt();
        System.out.println("Enter 4th Value");
        int d = sc.nextInt();
        
        if(a<b && a<c && a<d){
            System.out.println("1st Value is lowest");
        }else if(b<c && b<d){
            System.out.println("2nd Value is lowest");
        }else if(c<d){
            System.out.println("3rd Value is lowest");
        }else{
            System.out.println("4th Value is lowest");
        }

    }
    
    
}
