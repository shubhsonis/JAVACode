class Ptn4{
    public void pattern4() {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Ptn4 obj = new Ptn4();
        obj.pattern4();
    }
}
    
    
