 public class Pattern54{
 public static void main(String[] args) {
        
        for (int i = 5; i >= 1; i--) {
        
            for (int s = 5; s>i; s--) {
                  System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if((i==4&&j==2||(i==4&&j==3)||(i==3&&j==2)))
                {
                    System.out.print("_");
                }
                else 
                System.out.print(i);
                
            }
            System.out.println();
        }
    }
}

// 55555
//  4__4
//   3_3
//    22
//     1
