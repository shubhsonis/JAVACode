// 5) Crprivateeate an Object having two properties and four behaviours
// (add,substract,multiply,divide) to perform desired operation.object must have setter and getter and keep all properties .
import java.util.Scanner;
class opration{
    private int a,b;
    public void setA(int a){
        this.a = a;
    }
    public void setB(int b){
        this.b = b;
    }
    public int add(){
        return a+b;
    }
    public int sub(){
        return a-b;
    }
    public int mul(){
        return a*b;
    }
    public int div(){
        return a/b;
    }
}
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number A = ");
        int a = sc.nextInt();
        System.out.print("Enter Number B = ");
        int b = sc.nextInt();
        opration obj = new opration();
        obj.setA(a);
        obj.setB(b);
        System.out.println("Addition = " +(a+b));
        System.out.println("Substract = " +(a-b));
        System.out.println("Multipucation = " +a*b);
        System.out.println("Divide = " +a/b);
    }
}