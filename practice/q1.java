import java.util.Scanner;
class Salary{
   // float gross salary;
    public void computed(float salary, char r){
        if(r=='A'){
        grosssalary = basic+((basic*20)/100)+((basic*50)/100)+1700-((basic*11)/100);
        System.out.println("Gross salary = " +grosssalary);
        }
        if(r=='B'){
        grosssalary = basic+((basic*20)/100)+((basic*50)/100)+1700-((basic*11)/100);
        System.out.println("Gross salary = " +grosssalary);
        }
        if(r=='B'){
        grosssalary = basic+((basic*20)/100)+((basic*50)/100)+1700-((basic*11)/100);
        System.out.println("Gross salary = " +grosssalary);
        }
    }
}
       

    

class Sal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Basic Salary :- ");
        float basic = sc.nextfloat();
        System.out.print("Enter the Grade");
        char r = sc.next().charAt(0);
        Salary obj = new Salary();
        obj.gross(basic);
    }
}
    