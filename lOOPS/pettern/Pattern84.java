public class Pattern84 {
    
    public static void main(String[] args) {
        for(int i=1; i<=11; i++){
            for(int a=11,j=1; j<=11; a--,j++){
                if(i==1)
                    System.out.print("-");
                else if(j==1||j==11)
                    System.out.print("|");
                    else if(i==11)
                        System.out.print("-");
                        else if(i==j)
                            System.out.print("\\");
                        else if(a==i)
                            System.out.print("/");
                        else
                            System.out.print(" ");
            }
            System.out.println();
        }
    }
}

                
        
        
    

