import java.util.Scanner;
class A24{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:-");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter array element : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==arr.length){
            int temp = arr[i];
            arr[i] = arr[arr.length-1];
            arr[arr.length-1] = temp;
            System.out.print(arr[i]);
        }
    }

        

    }
}
           