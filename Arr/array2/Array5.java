import java.util.Scanner;
class A5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        System.out.println("Enter the position ");
        int pos = sc.nextInt();
        System.out.println("Enter value on position");
        int x = sc.nextInt();
        System.out.println();
        arr[pos] = x;
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}