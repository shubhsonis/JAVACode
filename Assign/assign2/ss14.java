import java.util.Scanner;
class Grading1{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter Your Marks");
    int x = sc.nextInt();
    
    if(x>90){
        System.out.println("A");
    }
        else if((x>80)&&(x<=90)){
            System.out.println("B");
        }
        else if((x>=60)&&(x<=80)){
            System.out.println("C");
        }
        else if(x<60){
            System.out.println("D");
        }
    }
}