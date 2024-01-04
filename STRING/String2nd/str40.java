// 40. Write a Java program to Count Number of Uppercase and Lowercase letters/
import java.util.Scanner;
class StrCountCase {
    String str;
    int uc = 0 , lc = 0;
    public StrCountCase(String str){
        this.str = str;
        for(int i=0;i<str.length();i++){
            int ch = str.charAt(i);
            if(ch>=65 && ch<=90)
                uc++;
            if(ch>=97 && ch<=122)
                lc++;
            }
        System.out.println("UpperCase Number in string: "+uc+"\n"+"LowerCase Number in string: "+lc);
    }
}
class StrCountCaseMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        new StrCountCase(str);
    }
}