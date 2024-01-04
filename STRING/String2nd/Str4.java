//4. Write a Java program to count a number of Unicode code points in the specified text range of a String
import java.util.Scanner;
public class Str4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("Enter the String ");
        String a=sc.nextLine();
        char a1[]=a.toCharArray();
        System.out.println("Enter the index number to start : ");
        int index0=sc.nextInt();
        for(int i=index0;i<a1.length;i++){
            count++;
        }
        System.out.println("Range of a string : "+count);
	}
}