import java.util.Scanner;
class Bonus{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Your Salary");
    int salary=sc.nextInt();
    System.out.println("Working Year");
    int wy=sc.nextInt();
    float bonus=0;

    if(wy>5){
        bonus = (salary*5)/100f;
    }
    System.out.println(salary+bonus);
}
}
