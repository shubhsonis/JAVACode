//Find the first repeating element in array of integers
import java.util.Scanner;
class rep{
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
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("First Repeating Element : " +arr[i]);
                }


                
            }
            System.out.println();
            
        }
    }
}