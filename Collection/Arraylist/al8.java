import java.util.Scanner;
import java.util.ArrayList;
class A8{
    public static void main(String args[]){
        int S=0,i,j,index1=0,index2=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of list");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter elements of list");
        for(i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println("Enter the sum:");
        int sum=sc.nextInt();
        for(i=0;i<n;i++){
            S=0;
            for(j=i;j<n;j++){
                S=S+list.get(j);
                // index1=i;
                // index2=j;

                if(S==sum){
                    System.out.println(i+" "+j);
                    
                }
            }
        }
    }
}