// 15. Write a Java program to create a character array containing the contents of a string\
import java.util.Scanner;
class StrCharArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        char ch[] = new char[str.length()];
        for(int i=0;i<str.length();i++){
            ch[i] = str.charAt(i);
            System.out.print(ch[i]+" ");
        }
    }
}
