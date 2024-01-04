public class Pattern63 {

    public static void main(String[] args) {
       int n=5;
         for(int i=1;i<=n;i++){
           int k=1;
            for(int j=1;j<=9;j++){
                if (j>=6-i&&j<=4+i) {
                    System.out.print(k);
                   k++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
         }

            
        }
         
    }
        //        1
        //       123
        //      12345
        //     1234567
        //    123456789
