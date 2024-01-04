import java.util.ArrayList;
import java.util.Scanner;

class A35{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array list");
        int n = sc.nextInt();
        boolean flag = false;
        int i;
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter elements of list");
        for(i=0;i<n;i++){
            arrayList.add(sc.nextInt());
        }
        System.out.println("Enter element you wnat to search");
        int ele = sc.nextInt();
        for(i=0;i<n;i++){
            if(arrayList.get(i) == ele){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Element found at index :"+i);
        }
        else{
            System.out.println("Element not found ");
        }
    }
}