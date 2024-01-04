// 18) Create class Product (pid, price, quantity) with parameterized constructor.Create a main function in different class (say XYZ) and perform following task:
// Accept five product information from user and store in an array
// Find Pid of product with highest price.
// Create method (with array of product’s object as argument) in XYZ class to calculate and return total amount spent on all products. (amount spent on single product=price of product * quantity of product).
import java.util.Scanner;
class Product{
    public int pid, price,quantity;
    int amount;
    private static  int totalamount=0;
    public Product(int pid,int price, int quantity){
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;
    }
    public Product(){

    }
    public void singleproductamount(Product p[]){
        for(int i=0; i<5; i++){
            p[i].amount=p[i].price*p[i].quantity;
            System.out.println((i+1)+" product amount : "+p[i].amount);
            totalamount+=p[i].amount;
        }
    }
        public static void totalamount(){
            System.out.println(" TotalAmount is : "+totalamount);
        }
        public static void higestpricepid(int k){
            System.out.println(" Higest price product ID is : " +k);
        }
}
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Product p[] = new Product[5];
        int max= Integer.MIN_VALUE;
        int k=0;
        for(int i=0; i<5; i++){
            System.out.println("Enter " +(i+1)+" product id");
            int pid=sc.nextInt();
            System.out.println("Enter "+(i+1)+" product price");
            int price=sc.nextInt();
            System.out.println("Enter "+(i+1)+" product quantity");
            int quantity=sc.nextInt();
            if(price>max){
                max=price;
                k=pid;
            }
            p[i]=new Product(pid,price,quantity);
        }
        Product obj =new Product();
        obj.singleproductamount(p);
        Product.totalamount();
        Product.higestpricepid(k);
    }
}



   
