import java.util.Scanner;
class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENter Array size ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter array Element : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=arr.length-1; i>=0; i--){
            System.out.println("Reverse order : "+arr[i]);
        }

    }
}