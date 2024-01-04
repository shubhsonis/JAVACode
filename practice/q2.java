import java.util.Scanner;
class Sales{
    public void loan(int sales){
        if(sales>10000){
            int bonus = 20*sales/100;
            System.out.print("Elegible for bonus= "+bonus);
        }else{
            System.out.print("Not elegible for bonus");
        }
    }
}
class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Sales Value = ");
        int sales = sc.nextInt();

        Sales obj = new Sales();
        obj.loan(sales);
    }
}