//Find minimum and maximum element in array
import java.util.Scanner;
class Array2{
    public void minmax(int arr[]){
        int max=0, min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max)
                max = arr[i];
            if(arr[i]<min)
                min = arr[i];
        }
        System.out.print("Maximum Element = " +max);
        System.out.println();
        System.out.println("Minmum Element = " +min);
    }
}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        System.out.println("Enter array element ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Array2 obj = new Array2();
        obj.minmax(arr);
    }
}



