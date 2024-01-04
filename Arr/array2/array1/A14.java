//Q.14. Find the first non-repeating elment in given array of integers 

import java.util.Scanner;
class A14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array ");
        int size=sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter the array element ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            for(int j= i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    arr[i] = 0;
                    arr[j] = 0;
                    
                   // System.out.print("repeating ele ");
                }
            }
        }
        int ans=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){

                ans = arr[i];
                System.out.print("Non repeating element :" +arr[i]);
                break;
            }
            System.out.println();
        }
    }
}