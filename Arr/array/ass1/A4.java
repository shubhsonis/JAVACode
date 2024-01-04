// wap to print max and min value in given array.
// class Maxarr{  
//     public static void main(String[] args) {  

//         //Initialize array  
//         int [] arr = {25, 11, 7, 75, 56};  
//         //Initialize max with first element of array.  
//         int max = arr[0];  
//         //Loop through the array  
//         for (int i = 0; i < arr.length; i++) {  
//             //Compare elements of array with max  
//            if(arr[i] > max)  
//                max = arr[i];  
//         }  
//         System.out.println("Largest element present in given array: " + max);  
//     }  
// }  

import java.util.Scanner;

class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        System.out.print("Enter Array  Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];

        }
        System.out.println("Maximum Array Element :" + max);

    }

}

// class consa{
// public consa(){
// this(100);
// System.out.println("Default constructor ");
// }
// public consa(int x){
// this(50,40);
// System.out.println("int consa called ");
// }
// public consa(int x,int y){
// // this();
// System.out.println("int int consa called ");
// }
// }
// class Main{
// public static void main(String[] args) {
// new consa();
// }
// }