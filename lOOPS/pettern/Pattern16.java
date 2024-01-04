class Pattern16{
    public static void main(String[] args) {
        //int k = 97;
        for(char i=97; i<=101; i++){
            for(char j=97; j<=i; j++){
                System.out.print((char) +i);
            }
            System.out.println();
        }
    }
}