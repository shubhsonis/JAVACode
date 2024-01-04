
// import java.util.Scanner;

// public class Occurrence {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter Array size ");
//         int size = sc.nextInt();

//         int arr[] = new int[size];

//         System.out.println("enter array elements ");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }

//         for (int i = 0; i < arr.length - 1; i++) {
//             int count = 0;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] == arr[j]) {
//                     count++;
//                 }
//             }
//             System.out.println("Occurance Number of " + arr[i]+" : "+count);
//         }
//     }
// }

class practice {
    public static void main(String []args){
        String s = "Welcome";
        char ch[] = {'s','h','u','b','h','a','m'};
        String s2 = new String(ch);
        System.out.println(s);
        System.out.println(s2);
    }
}
        