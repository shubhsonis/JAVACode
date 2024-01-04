public class Pattern59 {

    public static void main(String[] args) {
       int n=5;
         for(int i=1;i<=n;i++){
            int k=1;
            for(int j=n;j>=1;j--){
                if (i>=j) {
                    System.out.print(k+" ");
                    k++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
         }

            
        }
         
    }
//       1
//      1 2
//     1 2 3
//    1 2 3 4
//   1 2 3 4 5
