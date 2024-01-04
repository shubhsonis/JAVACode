// 8. Write a Java program to test if a given string contains the specified sequence of char values
import java.util.Scanner;

class StrSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "I am Bigboss ";

        String arr[] = str.split(" ");
        System.out.print("Enter char: ");
        String ch = sc.nextLine();
        boolean flag = false;
        for (String i : arr) {
            if (i.equals(ch))
                flag = true;
        }
        if (flag)
            System.out.println(ch + " : contains the specified sequence");
        else
            System.out.println("No the contains is specified sequence");
    }
}