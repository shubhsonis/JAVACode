// Q.7 Sub array with given sum
// Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.

// Example 1:
// Input:
// N = 5, S = 12
// A[] = {1,2,3,7,5}
// Output: 2 4
// Explanation: The sum of elements 
// from 2nd position to 4th position 
// is 12.

import java.util.ArrayList;
import java.util.Scanner;

class SubArray {
    public String findSum(ArrayList<Integer> list, int S) {
        int n = list.size();

        for (int i = 0; i < list.size(); i++) {
            int sum = 0;
            for (int j = i + 1; j < list.size(); j++) {
                sum += list.get(j);
                if (sum == S)
                    return i + 1 + " " + (j + 1);
            }
        }
        return null;
    }
}

public class Subarray7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element " + i + " : ");
            list.add(sc.nextInt());
        }

        SubArray obj = new SubArray();
        System.out.print("Enter sum to find : ");
        int s = sc.nextInt();

        System.out.println(obj.findSum(list, s));

    }
}