// 36. Write a Java program How to check Palindrome Strin
import java.util.Scanner;
class StrPalindrome1 {
    String str;
    public void palindrome(String str){
        this.str = str;
        String s ="";
        char ch[] = str.toCharArray();
        for(int i=ch.length - 1;i>=0;i--){
            s += ch[i];
        }
        if(s.equals(str))
            System.out.println("String is Palindrome");
        else 
            System.out.println("String is Not Palindrome");
    }
}
class StrPalindrome1Main{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        StrPalindrome1 obj = new StrPalindrome1();
        obj.palindrome(str);
    }
}