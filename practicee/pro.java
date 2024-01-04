import java.util.Scanner;
class Bill{
    int a,b,c;
    public void Pizza(int p){
        a = 100*p;
        System.out.println("\t\t\t Bill \t\t\t");
        System.out.println("..............................................................");
        System.out.println("Pizzas amount is = " +a);
    }
    public void Puffs(int puf){
        
        b = puf*20;
        System.out.println("Puffs amount is = " +b);
    }
    public void Coldrink(int co){
        
        c = co*10;
        System.out.println("Coldrink amount is = " +c);
        System.out.println("...............................................................");
    }
    public void Total(){
        int total = a+b+c;
        System.out.println("Generate Rajan  Bills Amount = " +total);
    }
}
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pizzas Quantity");
        int p = sc.nextInt();
        System.out.println("Enter Puffs Quantity ");
        int puf = sc.nextInt();
        System.out.println("Enter Coldrink Quantity ");
        int c  = sc.nextInt();

        Bill obj = new Bill();
        obj.Pizza(p);
        obj.Puffs(puf);
        obj.Coldrink(c);
        obj.Total();

    }
}
    
