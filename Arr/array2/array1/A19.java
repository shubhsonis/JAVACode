//Find Maximum product contigeous sub array .
import java.util.Scanner;
class A19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.print("Enter the element ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 1;
        int maxproduct =-2147483648;
        for(int i=0; i<arr.length; i++){
            sum = sum*arr[i];
            if(sum>maxproduct){
                maxproduct = sum;
            }
        }
        System.out.println("Subarray maximum sum = " +maxproduct);
    }
}