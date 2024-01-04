// 12. Write a Java program to check whether two String objects contain the same data
import java.util.Scanner;
class StrSameData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 string ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();


        if(str1.toLowerCase().equals(str2.toLowerCase()))
            System.out.println("Both String Contain same data");
        else 
            System.out.println("Both String does not contain same data");
    }
}
