// Q.2 Find minimum and maximum element in array

import java.util.ArrayList;
import java.util.Scanner;

public class Minmax {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();

        // arraylist.add(12);
        // arraylist.add(15);
        // arraylist.add(9);
        // arraylist.add(18);
        // arraylist.add(5);
        // arraylist.add(29);

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Element : ");
            int i = sc.nextInt();
            arraylist.add(i);

            System.out.print("Enter n : ");
            char ch = sc.next().charAt(0);

            if (ch == 'n')
                break;
        }
        int max = arraylist.get(0);
        int min = arraylist.get(0);

        for (int i = 0; i < arraylist.size(); i++) { // Maximum
            if (arraylist.get(i) > max) {
                max = arraylist.get(i);
            }
        }

        for (int i = 0; i < arraylist.size(); i++) {
            if (arraylist.get(i) < min) {
                min = arraylist.get(i);
            }
        }
        System.out.println("Maximum Number : " + max);
        System.out.println("Minimum Number : " + min);
    }
}


