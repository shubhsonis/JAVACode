import java.util.Scanner;
class A15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][]= new int[100][100];
        System.out.println("Enter the rows :"  );
        int r=sc.nextInt();
        System.out.println("Enter the column :"  );
        int c=sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("-");
            }
            System.out.println();
        }
        

    }
}