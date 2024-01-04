import java.util.Scanner;
class Student{
    public static void main(String[] args){
    Scanner sc= new Scanner (System.in);

    System.out.println("Enter Stusent Marks");
    float marks = sc.nextFloat();
    System.out.println("Enter Total Subject of Marks");
    float total = sc.nextFloat();
    float percentage = (marks/total)*100;
    System.out.println("Parcentage of Student :" +percentage);

    }
}    