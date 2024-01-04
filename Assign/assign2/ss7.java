import java.util.Scanner;
class Exam{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Class held :");
    int a = sc.nextInt();
    System.out.println("Classes Attended :");
    int b = sc.nextInt();
    float per= (a*b/100f);
    
    if(per>=75){
        System.out.println("Allowed in Exam");
    }else{
        System.out.println("Not Allowed in Exam");
    }
    }
}