// 33)	WAP to print Alphabets in reversing order.
class P33{
    public void alpha(){
        for(int i=90; i>=65; i--){
            System.out.print((char)i+ " ");
        }
    }
}
class pro33{
    public static void main(String[] args) {
        P33 obj = new P33();
        obj.alpha();
    }
}