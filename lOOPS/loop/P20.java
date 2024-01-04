// 20)	0	7	14	21	28	35	…..
// import java.util.Scanner;

// public class P20 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number : ");
//         int n = sc.nextInt();
//         int i = 0;
//         System.out.print(i + " ");
//         int x = 7;
//         for (x = 1; x <= n; x++) {
//             int y = 7;
//             System.out.print(y * x + " ");
//         }

//     }
// }










import java.util.Scanner;
class A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number ");
        int s  = sc.nextInt();
        int i = 7;
        for(i=1; i<s; i++){
            int j=7;
            System.out.print(i*j+" ");
        } 
    }
}