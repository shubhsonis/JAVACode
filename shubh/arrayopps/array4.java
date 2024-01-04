//Q.4 Write a program to sort the array
import java.util.Scanner;
class Array4{
    public void sort(int arr[]){
        
        for(int i=0; i<arr.length; i++){
            // int temp =0;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                   int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    //System.out.println(arr[j]);
                }
            }
            System.out.print(" "+arr[i]);
        }
    }
}
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size = ");
        int size = sc.nextInt();
        int arr[] = new int [size];
        System.out.println("Enter array element "+ " ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Array4 obj = new Array4();
        obj.sort(arr);
    }
}