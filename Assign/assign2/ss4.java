import java.util.Scanner;
class Grading{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter Your Marks");
    int x = sc.nextInt();
    
    if(x<25){
        System.out.println("F");
    }
        else if((x>=25)&&(x<45)){
            System.out.println("E");
        }
        else if((x>=45)&&(x<50)){
            System.out.println("D");
        }
        else if((x>=50)&&(x<60)){
            System.out.println("C");
        }
        else if((x>=60)&&(x<80)){
            System.out.println("B");
        }
        else if(x>80){
            System.out.println("A");
        }
    }
}

