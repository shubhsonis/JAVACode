
// Q.6 Find occurance of an integer number in array.
import java.util.ArrayList;
import java.util.Scanner;

class Occur {
    public void occurrValue(ArrayList list) {
        int n = list.size();

        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            int count = 1;
            boolean flag = true;
            for (int j = 0; j < list2.size(); j++) {
                if (list.get(i) == list2.get(j)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                list2.add((int) list.get(i));
                for (int j = i + 1; j < n; j++) {
                    if (list.get(i) == list.get(j))
                        count++;
                }
                System.out.println(list.get(i) + " ouccures in an ArrayList : " + count);
            }
        }
    }
}

public class Occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            System.out.print("Enter Element : ");
            list.add(sc.nextInt());

            System.out.print("Enter n for exit : ");

            if (sc.next().charAt(0) == 'n')
                break;
        }

        Occur obj = new Occur();

        obj.occurrValue(list);

        sc.close();
    }
}
