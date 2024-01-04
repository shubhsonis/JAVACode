import java.util.Scanner;
class OneBHK{
    private double roomArea;
    private double hallArea;
    private double price;

    public OneBHK(){}

    public OneBHK(double roomArea, double hallArea, double price){
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public void show(){
        System.out.println("\nRoom Area " +roomArea);
        System.out.println("hall Area " +hallArea);
        System.out.println("Price " +price);
    }
}
class TwoBHK extends OneBHK{
    private double room2Area;

    public TwoBHK(){}

    public TwoBHK(double roomArea, double hallArea, double price, double room2Area){
        super(roomArea, hallArea, price);
        this.room2Area = room2Area;
    }
    public void show(){
        super.show();
        System.out.println("Room2 Area " +room2Area);
    }
}
class XYZ{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        OneBHK flat1 = new TwoBHK(50, 30, 10000, 80);
        OneBHK flat2 = new TwoBHK(60, 40, 20000, 90);
        OneBHK flat3 = new TwoBHK(70, 50, 30000, 100);
 
        
        flat1.show();
        flat2.show();
        flat3.show();
        
        double totalamount = flat1.getPrice() + flat2.getPrice() + flat3.getPrice();
        System.out.println("\nTotal amount of all flats = " +totalamount);
    }
}


