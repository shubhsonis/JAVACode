
// 11) Create an Abstract class Processor with int member variable data and method showData to display data value.
// Create abstract method process() to define processing of member data.
// Create a class Factorial using abstract class 	Processor to calculate  and print 	factorial of a number by overriding the process method.
// Create a class Circle using abstract class Processor to calculate and print area of a circle by overriding the process 
// method Ask user to enter choice (factorial 	or circle area). 
// Also ask data to work upon; Use Processor class reference to achieve this mechanism.

import java.util.Scanner;
abstract class Processor{
    private int data;

    public Processor(int data){
        this.data = data;
    }
    public void showData(){
        //data = 1000;
        System.out.println("Data Value " +data);
    }
    public int getData(){
        return data;
    }
    abstract public void process();
}
class Factorial extends Processor{
  
    public Factorial(int data){
        super(data);
    }
    public void process(){
           int fact = 1;
        for(int i=1; i<=getData(); i++){
            fact*=i;
        }
        System.out.println("Factorial is : " +fact);
    }
}
class Circle extends Processor{
    private float area;

    public Circle(int data){
        super(data);
    }
    public void process(){
        area = 3.14f*getData()*getData();
        System.out.println("Area of Circle : " +area);
    }
}

class reference{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Press 1 for (Factorial ) or Press 2 for ( Circle Area :) ");
        int choice = sc.nextInt();
        switch(choice){
            case 1: {
                System.out.println("Enter any Number : ");
                int n = sc.nextInt();
                Factorial obj = new Factorial(n);
                obj.showData();
                obj.process();
                break;
            }
            case 2: {
                System.out.println("Enter any Number : ");
                int n = sc.nextInt();
                Circle obj = new Circle(n);
                obj.showData();
                obj.process();
                break;
            }
            default:
                System.out.println("Incorrect Choise entered ");
        }
    }
}