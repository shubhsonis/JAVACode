// 18. Write a java program to get the length of a given string
import java.util.Scanner;
class StrLength {
    private String str;
    public StrLength(String str){
        this.str = str;
        char ch[] = str.toCharArray();
        System.out.println("Length of String is: "+ch.length);
    }
}
class StrLengthMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        StrLength obj = new StrLength(str);
    }
}