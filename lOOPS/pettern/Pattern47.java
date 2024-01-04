public class Pattern47 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int s=4;s>=i;s--){
                  System.out.print(" ");
            }

                for(int j=1;j<=i;j++){
                    if((i==4&&j==3)||(i==4&&j==2)||(i==3&&j==2))
                    System.out.print("*");
                    else
                    System.out.print("1");
                }
                 System.out.println();
            }
           
        }
    }
    

//     1
//    11
//   1*1
//  1**1
// 11111
