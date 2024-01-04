// Q.3 Write a program to reverse the array.

import java.util.ArrayList;
import java.util.Scanner;


public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Arraylist  size  : ");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>(n);
        System.out.println("Enter Arraylist elements ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);

        ArrayList<Integer> rev = new ArrayList<>(n);
        System.out.println("Reverse Array Element ");
        for (int i = n-1; i >=0; i--) {
            rev.add(list.get(i));
        }
        System.out.println(rev);
    }
}
