class Pattern15{
    public static void main(String[] args) {
        
        for(char i=65; i<=69; i++){
            for(char j=65; j<=i; j++){
                System.out.print((char) +i);
            }
            System.out.println();
        }
    }
}

// A
// BB
// CCC
// DDDD
// EEEEE