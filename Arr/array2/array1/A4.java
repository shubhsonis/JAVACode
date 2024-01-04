// Write a program to sort the array
import java.util.Scanner;
class sort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter Array size ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array element ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }    
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                int tem = 0;
                if(arr[i]>arr[j]){
                    tem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tem;
                    

                }
            }
           // System.out.println();
            System.out.println(arr[i]+ " ");
        }
         
        
    }
}