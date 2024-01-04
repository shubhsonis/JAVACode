//WAP to print N natural number.
import java.util.Scanner;
class Natural{
    public void number(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number :- ");

        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(i+ " ");
        }
    }
} 
class test{
    public static void main(String[] args) {
        Natural obj = new Natural();
        obj.number();
    }
}