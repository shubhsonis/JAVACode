// 17. Write a Java program to convert all the characters in a string to Uppercas
import java.util.Scanner;

class StrUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch > 91)
                System.out.print((char) (ch - 32));
            else
                System.out.print(ch);
        }
    }
}