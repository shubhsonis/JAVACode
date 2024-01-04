public class Pattern45 {
    public static void main(String[] args) {
        int k=5;
        
        for (int i = 1; i <= 5; i++) {
            for (int space = 4; space >= i; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(k);
               
            }
            System.out.println();
             k--;
        }
    }

}
//     5
//    44
//   333
//  2222
// 11111

