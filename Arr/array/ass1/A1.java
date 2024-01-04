//wap to definean array of integer size 6. take input from user and display it in reverse order

// class Reverse {
//     public static void main(String[] args) {

//         // Initialize array
//         int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };

//         System.out.println("Original array: ");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }

//         System.out.println();

//         System.out.println("Array in reverse order: ");
//         // Loop through the array in reverse order
//         for (int i = arr.length - 1; i >= 0; i--) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// import java.util.Scanner;
// class Array1{
//     public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.println("Enter The Array Size : ");
// int size = sc.nextInt();
// int arr[] = new int[size];

// System.out.println("Enter the Array Elemen's : ");
// for(int i=0; i<arr.length; i++){
//     arr[i]= sc.nextInt();
// }
// System.out.print("Original Array : ");
// for(int i=0; i<arr.length; i++){
//     System.out.print(arr[i]+ " ");
// }
//         System.out.println();
//         System.out.println("Reverse Array : ");
//         for(int i=arr.length-1; i>=0; i--){
//             System.out.print(arr[i]+ " ");
//         }

//     }
// }
// int arr[] = {1,2,3,4,5,6};
// for(int i=0; i<arr.length; i++){
// System.out.println(" Orignal array :" +arr[i]);
//     }
//     for(int i= arr.length-1; i>=0 ; i--){
//         System.out.println("rev : " +arr[i]);
//     }
// }
// }

class A1 {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Original array");
        for (int i = 0; i <= arr.length-1; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        System.out.println("Reverse Array");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");

        }
    }
}