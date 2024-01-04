public class Pattern89 {
    public static void main(String[] args) {
        for(int i=1; i<=9; i++){
           // for(int space=)
            for(int j=1; j<=i; j++){
                if(i==5||j==5){
                    System.out.print(j);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    
}
