import java.util.Scanner;
class SpyNumber{
    private int no;

    public SpyNumber(int no) {
        this.no = no;
    }

    public void check() {
        int sum=0, mul = 1;
        while(no!=0) {
            int value = no % 10;
            sum = value + sum;
            mul = mul * value ;
            no = no / 10;
        }
        if(sum==mul){
            System.out.println("It is Spy Number");
        }else 
            System.out.println("It is not a Spy Number ");
    }
}

class Spy{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number ");
        int no = sc.nextInt();

        SpyNumber obj = new SpyNumber(no);
        obj.check();
    }
}