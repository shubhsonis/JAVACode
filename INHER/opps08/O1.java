import java.util.Scanner;

class Person {
      private String name;
      private byte age;

      Person(String name, byte age) {
            this.name = name;
            this.age = age;
             System.out.println("-----------------Your entered details------------");
            System.out.println("Your name : " + name);
            System.out.println("Your age : " + age);
      }
      Person (){
            
      }
}

class O1 {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your good name : ");
            String name = sc.nextLine();
            System.out.println("Enter your age : ");
            byte age = sc.nextByte();

            Person obj = new Person(name, age);

      }
}