import java.util.Scanner;
class Sum{
    public void pro(int n){
        int lo = 101;
        int up = 200;
        int sum = 0;
        for(int i=lo; i<up; i++){
            if(i%7==0){
            sum = sum+i;
            
            }
            System.out.print("Sum = " +sum);
        }
    }
}
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number ");
        int n = sc.nextInt();
        Sum obj = new Sum();
        obj.pro(n);
    }
}

