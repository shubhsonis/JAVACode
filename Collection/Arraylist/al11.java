import java.util.Scanner;
import java.util.ArrayList;
class A11{
    public static void main(String args[]){
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of list");
        int n = sc.nextInt();
        ArrayList<Integer> arraylist = new ArrayList<>();
        System.out.println("Enter elements of list");
        for(i=0;i<n;i++){
            arraylist.add(sc.nextInt());
        }
        int temp = arraylist.get(0);
        System.out.println("Cyclically rotated by one");
        for(i=1;i<n;i++){
           for(j=1;i<n-1;j++){
            int c = arraylist.get(i);
            arraylist.set(i,temp);
            temp = c;
           }
        }
        arraylist.set(0,temp);
        for(i=0;i<n;i++){
            System.out.println(arraylist.get(i));
        }
    }
}