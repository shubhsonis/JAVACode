class ICICI{
    int bal = 10000;
    public void balenquiry(){
        System.out.println("Balance = " +bal);
    }
    public void deposit(int amt){
        bal = bal+amt;
        System.out.println("Total bal = " +bal);
    }
    public void withdrawn(int amt){
        if(amt>bal)
        System.out.println("Insufficient Balance");
        else
        System.out.println("Withdrawn Successfull ");
    } 
}

class ICICIMain{
    public static void main(String args[]){
        ICICI Sahil = new ICICI();
        ICICI Rohit = new ICICI();

        Rohit.balenquiry();
        Sahil.deposit(5000);
    }
}
