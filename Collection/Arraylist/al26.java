import java.util.ArrayList;
import java.util.Scanner;

class A26{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array list");
        int n = sc.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter elements of list");
        for(int i=0;i<n;i++){
            arrayList.add(sc.nextInt());
        }
        System.out.println("Reverse list :");
        for(int i=n-1;i>=0;i--){
            //  for(int j : arrayList){
                System.out.println(arrayList.get(i));
            //  }
        }
    }
}