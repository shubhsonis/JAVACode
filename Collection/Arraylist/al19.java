import java.util.ArrayList;
import java.util.Scanner;

class A19{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array list");
        int n = sc.nextInt();
        int sum = 0,i,j;
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter elements of list");
        for(i=0;i<n;i++){
            arrayList.add(sc.nextInt());
        }
        int max = arrayList.get(0);
        for(i=0;i<n;i++){
            sum = sum + arrayList.get(i);
        if(max < sum ){
            max = sum;
        }
        }
        System.out.println("Maximum sum is :"+max);
    }
}