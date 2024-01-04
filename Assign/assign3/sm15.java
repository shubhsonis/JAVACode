//farmula area of Shelly garden= length*breadth
// farmula area = Rside*Rside

class A15{
    public static void main(String[] args) {
        int length =22 ,breadth = 15, side =21;
        int sg = (length*breadth);
        int rg = (side*side);
        System.out.println("Shelly Garden : " +sg);
        System.out.println("Rachel Garden : " +rg);
        if(sg>rg){
            System.out.println("Shelly Garden is Bigger ");
        }else{
            System.out.println("Rachel Garden is Bigger");
        }
        
    }

}
