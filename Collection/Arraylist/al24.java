import java.util.ArrayList;
import java.util.Scanner;

class A24{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array list");
        int n = sc.nextInt();
        int sum = 0,i,j;
        float avg = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter elements of list");
        for(i=0;i<n;i++){
            arrayList.add(sc.nextInt());
        }
        for(i=0;i<n;i++){
            sum = sum + arrayList.get(i);
        }
        for(i=0;i<n;i++){
            avg = sum/arrayList.size();
        }
        System.out.println("sum :"+sum);
        System.out.println("Average :"+avg);
    }
}