import java.util.Scanner;
class Dis{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Quantity :");
    int a = sc.nextInt();
    float q = a*100;
    float x,disc;

    if(q>1000){
        x= (q*10)/100f;
        disc= q-x;
    }else
      disc=q;  
     System.out.println(disc);  
    }
}
    




