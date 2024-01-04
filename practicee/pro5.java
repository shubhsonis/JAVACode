class prime{
    public void number(int n ){
        int temp = 0;
        for(int i=1; i<=n; i++){
            for(int j=2; j<=i; j++){
                if(n%j==0){
                    temp= temp+1;
                }
            }
            if(temp==0){
                System.out.println("This is Prime number = ");
            }
        }
    }
}