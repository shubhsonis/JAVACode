//15)	WAP to print alphabets in lowercase.
class P15 {
    public  void lower(){

        for (int i = 97; i <= 122; i++) {
            System.out.println((char) i);
        }
    }


    public static void main(String[] args) {
        P15 obj = new P15();
        obj.lower();
    }
}