import java.util.ArrayList;
import java.util.Scanner;

class A27{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array list");
        int n = sc.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter elements of list");
        for(int i=0;i<n;i++){
            arrayList.add(sc.nextInt());
        }
        int max = arrayList.get(0);
        int min = arrayList.get(0);
        for(int i=0;i<=n;i++){
            if(min > arrayList.get(i)){
                min = arrayList.get(i);
            }
        }
        for(int i=0;i<=n;i++){
            if(max < arrayList.get(i)){
                max = arrayList.get(i);
            }
        }
        System.out.println("Maximum :"+max);
        System.out.println("Minimum :"+min);

    }
}