//14)	WAP to print alphabets in uppercase
class P14{
    public void Upper(){
        for (int i = 65; i<= 90; i++) {
            System.out.println((char) i);
        }
        // return ( (char) i);

    }

    public static void main(String[] args) {
        P14 obj = new P14();
        obj.Upper();
    }
}