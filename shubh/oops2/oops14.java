// 14) Create a class MathOperation with two data member X and Y to store the operand and third data member R to store result of operation.Create method members
// init - to input X and Y from user
// add - to add X and Y and store in R
// multiply - to multiply X and Y and store in R
// power - to calculate X Y and store in R
// display- to display Result R
import java.util.Scanner;
class MathOperation{
    private int x,y,r;

    public MathOperation(int x, int y){
        this.x = x;
        this.y = y;
        //this.r = r;
    }
    public void add(){
        r = x+y;
        System.out.println("Addition: "+r);
        mul();
    }
    public void mul(){
        r = x*y;
       System.out.println("Multiply: "+r);
       power();
    }
    public void power(){
        r=1;
        for(int i=1;i<=y;i++){
            r=r*x;
        }
        System.out.println("Power: "+r);
    }
    public void display(){
        add();
    }
}
    
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number x = ");
        int x = sc.nextInt();
        System.out.print("Enter Number y = ");
        int y = sc.nextInt();
        MathOperation obj = new MathOperation(x , y);
        obj.display();
    }
}