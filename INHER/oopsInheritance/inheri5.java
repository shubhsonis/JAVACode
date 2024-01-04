//import java.util.Scanner;
class OneBHK{
    private int roomArea;
    private int hallArea;
    private int price;

    public OneBHK(int roomArea, int hallArea, int price){
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
    }
    public void show(){
        System.out.println("Room Area " +roomArea);
        System.out.println("hall Area " +hallArea);
        System.out.println("Price " +price);
    }
}
class Main{
    public static void main(String[] args) {
        OneBHK obj = new OneBHK(30, 20, 80000);
        obj.show();
    }
}