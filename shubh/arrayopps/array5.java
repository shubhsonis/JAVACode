import java.util.Scanner;

class Array5{
    public void largest(int[] arr , int k) {
        
         for(int i=0; i<arr.length-1; i++){
            for(int j= i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                     int temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;               
                }
            }
            if(i==k-1){
                System.out.print("largest element  " +arr[arr.length-k]);
            // }//else{
               // System.out.print("Smallest " +arr[0+k]);
           // }
            }
        }
    }
}
class Test5{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Array size ");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        System.out.print("Enter K Number = ");
        int k= sc.nextInt();
        
        System.out.println("Enter array element ");
        for(int i=0; i<arr.length; i++){
            //for(int j=i+1; j<arr.length; j++){
                arr[i] = sc.nextInt();
        }
        
        Array5 obj = new Array5();
        obj.largest(arr, k);

    }
}
       
    
       
       
