//Count pair with given sum.
//Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.

import java.util.Scanner;
class Array11{
    public void pair(int arr[],int k){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==k){
                    count++;break;
                }
            }
        }
        System.out.println();
        System.out.println("Output is :- " +count);
    }
}
class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size :- ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter K Element = ");
        int k =sc.nextInt();
        System.out.println("Enter array element ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Array11 obj = new Array11();
        obj.pair(arr,k);
        
    }
}


    
