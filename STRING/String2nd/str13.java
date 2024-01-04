// 13. Write a Java program to get the contents of a given string as a byte array
import java.util.Scanner;
class StrByteArray {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();
        for(char i : arr)
            System.out.print((byte)i+" ");
   } 
}
