public class Pattern64 {

    public static void main(String[] args) {
      
         for(int i=1;i<=5;i++){
          char ch=65;
            for(int j=1;j<=9;j++){
                if (j>=6-i&&j<=4+i) {
                    System.out.print(ch);
                   ch++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
         }

            
        }
    }
         
    
      