// Peak an element
import java.util.Scanner;
class Array1{
    public void Peak(int arr[]){
        for(int i=1; i<arr.length-1; i++){
            if(arr[i]>arr[i-1]&&arr[i]<arr[i+1]){
                System.out.println(" "+arr[i]);
            }
        }
    }
}

class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array element ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Array1 obj = new Array1();
        obj.Peak(arr);
    }
}

        
        
    
