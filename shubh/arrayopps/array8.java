//Given () unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element
import java.util.Scanner;
class Array8{
    public void posneg(int arr[]){
        for(int i=0; i<arr.length;i++){
            if(arr[i]>0){
                System.out.print(arr[i]+ " ");
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                System.out.print(arr[i]+ " ");
            }
        }
    }
}
class pos{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Array size ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter array element "+" ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Array8 obj = new Array8();
        obj.posneg(arr);
    }
}
            
        
        
    


