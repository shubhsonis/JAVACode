//program to find nearest lesser and greater element in array
import java.util.Scanner;
class A23{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array element :");
        for(int i=0; i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        for(int i=0; i<arr.length; i++){
            if(arr[i]>num){
                System.out.println("Element greter than " +num+ "is : " +arr[i]);
            }else if(arr[i]==num){
                System.out.println("Element equal " +num+ "is : " +arr[i]);
            }
            else{
                System.out.println("Element lesser than " +num+ "is : " +arr[i]);
            }
        }
    }
}
    
