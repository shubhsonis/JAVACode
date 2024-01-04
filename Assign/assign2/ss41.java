import java.util.Scanner;
class Notes{
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);

     System.out.println("Enter a Amount");
     int amt = sc.nextInt();
     int n2000, n500, n200, n100, n50, n20, n10;
     n2000=n500=n200=n100=n50=n20=n10=0;
     
     if(amt>=2000)
        n2000= amt/2000;
        amt%=2000;
    if(amt>=500)
        n500= amt/500;
        amt%=500;    
    if(amt>=200)
        n200= amt/200;
        amt%=200;    
    if(amt>=100)
        n100= amt/100;
        amt%=100;
    if(amt>=50)
        n50= amt/50;
        amt%=50;
    if(amt>=20)
        n20= amt/20;
        amt%=20;
    if(amt>=10)
        n10= amt/10;
        amt%=10;
    
    System.out.println("Note of 2000 = " +n2000); 
    System.out.println("Note of 500 = " +n500);
    System.out.println("Note of 200 = " +n200);
    System.out.println("Note of 100 = " +n100);
    System.out.println("Note of 50 = " +n50);
    System.out.println("Note of 20 = " +n20);
    System.out.println("Note of 10 = " +n10);
    System.out.println("Total no of Note = "+(n2000+n500+n200+n100+n50+n20+10));
    }
}   


