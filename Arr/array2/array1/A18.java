// Find largest sum contigeous sub array
import java.util.Scanner;
class A18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter array size ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter array element ");
        for(int i=0; i<arr.length; i++){
             arr[i] = sc.nextInt();
        }
        int sum=0, currentMax= -2147483647;
        for(int i=0; i<arr.length; i++){
           // int sum=0;
            //for(int j=0; j<arr.length-1; j++){
                sum=sum+arr[i];
            if(currentMax<sum)
                currentMax=sum;
        }
        System.out.println();
        System.out.println("Output is :- " +currentMax);
    }
}