// 7. Write a Java program to concatenate a given string to the end of another string
import java.util.Scanner;
class StrEndOfString {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 String");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(str2+" "+str1);
    }    
}