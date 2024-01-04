// 38. Write a Java program to Given string Convert Lowercase to Uppercase
import java.util.Scanner;
class StrLowToUpr {
    String str;
    public StrLowToUpr(String str){
        this.str = str;
        // char ch[] = str.toCharArray();
        for(int i=0;i<str.length();i++){
            int ch = str.charAt(i);
            if(ch > 91)
                System.out.print((char)(ch - 32));
            else 
                System.out.print((char)ch);

        }
    } 
}
class StrLowToUprMain{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String in LowerCase ");
        String str = sc.nextLine();
        new StrLowToUpr(str);
    }
}
