import java.util.Scanner;
class A6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size ");
        int size = sc.nextInt();

        int arr[]= new int [size];
        System.out.println("Enter the elements of array ");
        for(int i=0; i<size; i++){
            arr [i] = sc.nextInt();
        }
        int sum = (size+1)*(size+2)/2;
        for(int i=0; i<size; i++){
            sum =sum-arr[i];
        }
        System.out.println("Missing elements " +sum);
    }
}
       
        
        

    
