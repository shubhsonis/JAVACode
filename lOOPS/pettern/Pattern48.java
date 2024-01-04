public class Pattern48 {
    public static void main(String[] args) {
        for(int i=65;i<=69;i++)
        {
            for(int s=68;s>=i;s--){
                  System.out.print(" ");
            }

                for(int j=65;j<=i;j++){
                    if((i==68&&j==67)||(i==68&&j==66)||(i==67&&j==66))
                    System.out.print("_");
                    else
                    System.out.print((char)j);
                }
                 System.out.println();
            }
           
        }
    }
//     A
//    AB
//   A_C
//  A__D
// ABCDE
