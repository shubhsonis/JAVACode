
//Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.
import java.util.Scanner;

class A8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter Array size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print(" Enter the Array element : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + " ");
            }
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
