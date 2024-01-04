//Q.7 Sub array with given sum
//Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.
import java.util.Scanner;
class A7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements of array ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out. println("Enter sum value ");
        int sum = sc.nextInt();
        int ans =0;
        for(int i=0; i<arr.length;i++){
             int sum1 = 0;
            for(int j=0; j<arr.length;j++){
                if(sum==sum1){
                    sum = sum1+arr[j];
                //  System.out.println(sum);
                
                }
            }
        }
        System.out.println(sum);
    }
}
