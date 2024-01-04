// Write a Java program to reverse the element of an integer 1-D array. 
import java.util.Scanner;
class A25{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size :- ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.print("Enter the element ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Orignel array ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();    
        System.out.println("Array Reverse ");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+ " ");
        }
    }
}
    

