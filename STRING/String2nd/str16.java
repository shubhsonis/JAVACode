// 16. Write a Java program to convert all the characters in a string to Lowercase\
import java.util.Scanner;
class StrLowerCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:");
        String str = sc.nextLine();
        
        for(int i=0;i<str.length();i++){
            int ch = str.charAt(i);
            if(ch < 91 && ch > 61)
                System.out.print((char)(ch + 32));
            else 
                System.out.print((char)ch);
        }
    }
}
