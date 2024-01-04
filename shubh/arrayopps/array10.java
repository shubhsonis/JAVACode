//Q.10. Write a program to cyclically rotate array by one.
import java.util.Scanner;
class Array10{
    public void rotate(int arr[]){
      int n= arr.length, last =arr[n-1];
      for (int i = n-1; i>=0; i--){
      arr[i] = arr[i-1];
      
    }
    arr[0] = last;
      System.out.print("The rotated Array is: " +arr[i]);
        
    }
}
class Test{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.print("Enter array element " + " ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Array10 obj = new Array10();
        obj.rotate(arr);
    }
}
        
