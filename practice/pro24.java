import java.util.Scanner;

class Automorphic{
    private int no;

    public Automorphic(int no){
        this.no = no;
    }

    public String check() {
        int check = (no*no);
        System.out.println("check  = " +check);

        boolean flag = false;
        while(no != 0) {
            int n1 = no % 10;
            int n2 = check % 10;
            if(n1==n2) {
                flag = true;
            }else {
                flag = false;
                break;
            }
            no /= 10;
            check /= 10;
        }

        if (flag)
           return ("It is Automorophic ");
        else
            return ("It is not a Automorophic "); 
    }
}

class TestMain{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter a  Number ");
        int no = sc.nextInt();

         Automorphic obj = new Automorphic(no);
         System.out.println (obj.check());

         
    }

}