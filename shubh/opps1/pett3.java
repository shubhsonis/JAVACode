class Ptn3{
    public void pattern3(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                if(i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
     
    }

    public static void main(String args[]){
        Ptn3 obj = new Ptn3();
        obj.pattern3();
    }
}


