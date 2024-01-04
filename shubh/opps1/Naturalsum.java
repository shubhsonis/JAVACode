//WAP to find out the sum of N natural number.
import java.util.Scanner;
class opp3{
    public int naturalnum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum+i;
        }
        return sum;
    }
    

    public static void main(String[] args) {
    opp3 obj = new opp3();
    int a = obj.naturalnum();
    System.out.println(a);
    }
}
