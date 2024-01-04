//19)	1	+	1/2	+	1/3	+	1/4	+	1/5	….. n terms(find out sum)
import java.util.Scanner;
class P19{
    public void series3(int n){
        float sum = 0f;
        for(int i=1; i<=n; i++){
            float s = 1f/i;
            sum = sum+s;
            System.out.print(s+" ");
            
        }
        System.out.print(" = " +sum+ " ");
    }
}
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number :- ");
        int n = sc.nextInt();
        
        P19 obj = new P19();
        obj.series3(n);
    }
}