import java.util.Scanner;
import java.util.ArrayList;

class A9 {
    public static void main(String args[]) {
        int i, j, k, pcount = 0, ncount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of list");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter elements of list");
        for (i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        for (i = 0; i < n; i++) {
            if (list.get(i) > 0) {
                pcount++;
            } else {
                ncount++;
            }
        }
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for (i = 0, j = 0, k = 0; i < n; i++) {
            if (list.get(i) >= 0) {
                // positive.add(list.get(i));
                positive.add(j, list.get(i));
                j++;
            } else {
                // negative.add(list.get(i));
                negative.add(k, list.get(i));
                k++;
            }
        }
        System.out.println("Final list :");
        for (i = 0, j = 0; i < n; i++) {
            if (i < positive.size()) {
                list.add(i, positive.get(i));
            } else {
                list.add(i, negative.get(j));
                j++;
            }
            System.out.println(list.get(i));
        }
    }
}