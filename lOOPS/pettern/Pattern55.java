 public class Pattern55{
 public static void main(String[] args) {
        
        for (int i = 5; i >= 1; i--) {
            char ch = 65;
            for (int j = 1; j <= 5 - i; j++) {
                  System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
// ABCDE
//  A__D
//   A_C
//    AB
//     A
