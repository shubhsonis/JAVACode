// 11. Write a Java program to check whether a given string ends with the contents of another string
import java.util.Scanner;

class Str11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();

        String[] sr1 = str.split(" ");

        System.out.println("Enter word for str");
        String sr = sc.nextLine();

        boolean flag = false;
            if (sr1[sr1.length - 1].equals(sr))
            flag = true;
        
        if (flag)
            System.out.println("Present");
        else
            System.out.println("Not Present");
    }
}
