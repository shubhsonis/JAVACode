// 19. Write a Java program to replace a specified character with another character
import java.util.Scanner;
class StrReplaceCharacter {
    private char a, b;
    public void replace(String str , char a , char b){
        this.a = a;
        this.b = b;
        char ch[] = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]==a)
                ch[i] = b;
            System.out.print(ch[i]);
        }
    }
}
class StrReplaceCharacterMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello World";
        System.out.print("Enter character which were remove: ");
        char a = sc.next().charAt(0);
        System.out.print("Enter character which is replaced old one: ");
        char b = sc.next().charAt(0);
        StrReplaceCharacter obj = new StrReplaceCharacter();
        obj.replace(str, a, b);
    }
}