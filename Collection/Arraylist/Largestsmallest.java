
// Q.5 Find the kth largest and kth smallest element in array.
import java.util.ArrayList;
import java.util.Scanner;

public class Largestsmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array list Number : ");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>(n);
        System.out.println("Enter Element : ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int k = 3;
        int temp = 0;
        ArrayList<Integer> list2 = new ArrayList<>(list);
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (list2.size() < list2.size()) {
                    temp = list2.get(i);
                    list2.set(i, list2.get(j));
                    list2.set(j, temp);

                }
            }
            if (i == k) {
                System.out.println(k + " largest elements " + list2.size());
            }
        }
    }
}