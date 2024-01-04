
// Q.4 Write a program to sort the array
import java.util.ArrayList;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array list Number : ");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>(n);
        System.out.println("Enter Element : ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int temp = 0;
        ArrayList<Integer> sortlist = new ArrayList<>(list);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sortlist.get(i) > sortlist.get(j)) {
                    temp = sortlist.get(i);
                    sortlist.set(i, sortlist.get(j));
                    sortlist.set(j, temp);
                }
            }
        }
        System.out.println(sortlist);
    }
}