import java.util.ArrayList;
import java.util.Scanner;

class A25{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array list");
        int n = sc.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter elements of list");
        int i;
        for(i=0;i<n;i++){
          arrayList.add(sc.nextInt());
        }
        System.out.println("swapping first and last elements of list");
        for(i=0;i<n;i++){
            int temp = arrayList.get(0);
            arrayList.set(0,arrayList.get(n-1));
            arrayList.set(n-1,temp);
        
        System.out.println(arrayList.get(i));
        }
    }
}