// 39. Write a Java program to Given string Convert Uppercase to Lowercase
import java.util.Scanner;
class StrUprToLow {
    String str;
    public StrUprToLow(String str){
        this.str = str;
        // char ch[] = str.toCharArray();
        for(int i=0;i<str.length();i++){
            int ch = str.charAt(i);
            if(ch < 91 && ch > 61)
                System.out.print((char)(ch + 32));
            else 
                System.out.print((char)ch);

        }
    } 
}
class StrUprToLowMain{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String in UpperCase ");
        String str = sc.nextLine();
        new StrUprToLow(str);
    }
}
