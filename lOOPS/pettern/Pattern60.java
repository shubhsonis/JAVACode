public class Pattern60 {

    public static void main(String[] args) {
       
         for(int i=65;i<=69;i++){
            int k=65;
            for(int j=69;j>=65;j--){
                if (i>=j) {
                    System.out.print((char)k+" ");
                    k++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
         }

            
        }
         
    }     

    //      A
    //     A B
    //    A B C
    //   A B C D
    //  A B C D E  
