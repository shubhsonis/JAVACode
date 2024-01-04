// 28. Write a Java program to Swap Two Strings without Third String Variable
import java.util.Scanner;

class StrSwapWithout {
    private String str1, str2;

    public StrSwapWithout(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        for (int i = 0; i < ch1.length; i++) {
            ch1[i] ^= ch2[i];
            ch2[i] ^= ch1[i];
            ch1[i] ^= ch2[i];
        }
        str1 = new String(ch1);
        str2 = new String(ch2);
        System.out.println("After Swaping....");
        System.out.println("str1: " + str1 + "\n" + "str2: " + str2);
    }
}

class StrSwapWithoutMain {
    public static void main(String []args) {
        System.out.println("Before Swaping.....");
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("str1: " + str1 + "\n" + "str2: " + str2);
        StrSwapWithout obj = new StrSwapWithout(str1 , str2);
        // obj.display();
    }
}