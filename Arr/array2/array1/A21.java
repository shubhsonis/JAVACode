//  Write a Java program to find the sum and average of one dimensional integer array.
import java.util.Scanner;
class A21{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:-");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array element : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
           // System.out.println("Enter  element : ");
        }
        double sum = 0, average = 0;
        for(int i=0; i<arr.length; i++){
               sum = sum+arr[i];
        }
        average = sum/arr.length;
        System.out.println("Sum : "+sum);
        System.out.println("Average : "+average);

    }
}
               
