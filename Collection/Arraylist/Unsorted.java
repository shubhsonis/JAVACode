// Q.8
// Given an unsorted array arr[] of size N having both negative and positive integers.
// The task is place all negative element at the end of array without changing the order of positive element and negative element.

import java.util.ArrayList;
import java.util.Scanner;

public class Unsorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array list size : ");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter Element : ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        for(int i=0; i<n; i++){
            if(list.get(i)>0){
                System.out.print(list.get(i)+ " ");
            }
        }
        for(int i=0; i<n; i++){
            if(list.get(i)<0){
                System.out.print(list.get(i)+ " ");
            }
        }
        System.out.println();
    }
}

 