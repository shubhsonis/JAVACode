import java.util.Scanner;
class Reverse{
    public void Rev(int arr[]){
        System.out.println("Reverse Array Element = "+" ");
        //int arr[] = new int[size];
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+ " ");
        }
    }
}
class ReverseMain{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array size = ");
        int size = sc.nextInt();

        int arr[] = new int [size];
        System.out.print("Enter Array Element = "+" ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Reverse obj = new Reverse();
        obj.Rev(arr);
            
        
    }
}