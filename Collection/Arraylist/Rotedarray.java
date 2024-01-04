// // Q.10.
// // Write a program to cyclically rotate array by one.

// import java.util.ArrayList;
// import java.util.Scanner;

// public class Rotedarray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = 5;
//         ArrayList<Integer> list = new ArrayList<>();

//         for (int i = 0; i < n; i++) {
//             System.out.print("Enter " + i + " element : ");
//             list.add(sc.nextInt());
//         }

//         int temp = list.get(0);

//         for (int i = 1; i < n; i++) {
//             list.set(i - 1, list.get(i));
//         }

//         list.set(n - 1, temp);

//         System.out.println(list);

//         byte x = 5; 
//         byte obj = x;
//     }