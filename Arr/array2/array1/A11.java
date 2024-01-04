//Q.11 Count pair with given sum.
import java.util.Scanner;
class A11{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array element :- ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter K element:- ");
        int k= sc.nextInt();

       // int arr[] = {1,5,7,1};
        //int k = 6,
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