class Ptn2{
    
    public void pattern2(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
 
    }

    public static void main(String[] args) {
        Ptn2 obj = new Ptn2();
        obj.pattern2();
    }
}
