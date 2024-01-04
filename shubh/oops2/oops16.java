
// 16) Create a class Person with properties (name and age) with following features.
// Default age of person should be 18.
// A person object can be initialized with name and age.
// Method to display name and age of person.
import java.util.Scanner;
class Person{
    private int age;
    private String name;
    public void setData(String name){
        this.name = name;
       // Age();
    }
    public void Age(){
        age = 18;
       // display();
    }
    public void display(){
        System.out.println("Name :- " +name);
        System.out.println("Age : - " +age);
    }
  
   
}
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre Your Name :- ");
        String name = sc.nextLine();

        Person obj = new Person();
        obj.setData(name);
        obj.Age();
        obj.display();
   
    }        
}


