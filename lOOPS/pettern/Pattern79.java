    
public class Pattern79 {
    
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            int k=1;
            for(int j=1;j<=4;j++){
                if(i<=4){
                    if(j<=i){
                        System.out.print(k);
                        k++;
                    }
                    else 
                    System.out.print(" ");
                }
                else if(j<=8-i){
                    System.out.print(k);
                    k++;
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}
