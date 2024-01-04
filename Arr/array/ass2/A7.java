import java.util.Scanner;

class A7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size : ");
        int size = sc.nextInt();

        int arr[] = new int[size]; // array declaration

        System.out.print("Enter the elements of the array ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the insert element ");
        int pos = sc.nextInt();

        System.out.print("Enter the element you want to insert:");
        int x = sc.nextInt();
        for (int i = (size - 1); i >= (pos - 1); i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos - 1] = x;
        System.out.print("After inserting:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[size]);
    }
}