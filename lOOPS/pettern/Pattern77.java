public class Pattern77 {
    
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            for(int j=1;j<=4;j++){
                if(i==1||i==2||i==3||i==4){
                    if(j<=i){
                        System.out.print("X");
                    }
                    else 
                    System.out.print(" ");
                }
                else if(j<=8-i){
                    System.out.print("X");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}
