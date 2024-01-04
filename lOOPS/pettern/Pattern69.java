public class Pattern69 {

    public static void main(String[] args) {
       int n=5;
         for(int i=1;i<=n;i++){
           
            for(int j=1;j<=9;j++){
                if (j>=6-i&&j<=4+i) {
                    if(j==5)
                    System.out.print("#");
                    else {
                    System.out.print("*");
                }
            }
            else {
            System.out.print(" ");
            }
           
         }
 System.out.println();
            
        }
         
    }
    }
            //       #
            //      *#*
            //     **#**
            //    ***#***
            //   ****#****
