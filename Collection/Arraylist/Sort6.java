//  Q.7 Sort the array of 0s, 1s and 2s.

import java.util.ArrayList;
import java.util.Scanner;

class Sort {
    public void sorting(ArrayList list) {
        int n = list.size();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((int) list.get(i) != 0 || (int) list.get(i) != 1 || (int) list.get(i) != 2) {
                    int temp = (int) list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
}

public class Sort6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element : ");
            list.add(sc.nextInt());
        }

        Sort obj = new Sort();
        obj.sorting(list);

        System.out.println(list);
    }
}